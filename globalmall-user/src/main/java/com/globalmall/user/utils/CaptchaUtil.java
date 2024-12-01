package com.globalmall.user.utils;

import com.globalmall.user.constant.CaptchaConstant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 图形验证码工具类
 */
public class CaptchaUtil {
//    private static final int WIDTH = 120;  // 验证码图片宽度
//    private static final int HEIGHT = 40; // 验证码图片高度
//    private static final int CODE_COUNT = 4; // 验证码字符个数
//    private static final int LINE_COUNT = 10; // 干扰线条数

    // 存储验证码数据，用于后续校验
    private static final ConcurrentHashMap<String, String> captchaStore = new ConcurrentHashMap<>();
    private static final String CAPTCHA_KEY_PREFIX = "captcha_";

    /**
     * 生成验证码图片并返回Base64字符串
     *
     * @param key 唯一标识，用于标记验证码
     * @return Base64编码的验证码图片
     */
    public static String generateCaptcha(String key) {
        // 生成随机验证码
        String captchaCode = generateRandomCode(CaptchaConstant.CODE_COUNT);
        captchaStore.put(CAPTCHA_KEY_PREFIX + key, captchaCode);

        BufferedImage image = new BufferedImage(CaptchaConstant.WIDTH, CaptchaConstant.HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();

        // 填充背景
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, CaptchaConstant.WIDTH, CaptchaConstant.HEIGHT);

        // 画干扰线
        drawLines(g, CaptchaConstant.LINE_COUNT);

        // 绘制验证码
        drawCaptchaText(g, captchaCode);

        // 转换图片为Base64
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", outputStream);
        } catch (IOException e) {
            throw new RuntimeException("生成验证码失败", e);
        }
        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }

    /**
     * 校验验证码
     *
     * @param key        验证码的唯一标识
     * @param inputCode  用户输入的验证码
     * @return 校验结果
     */
    public static boolean validateCaptcha(String key, String inputCode) {
        String storedCode = captchaStore.get(CAPTCHA_KEY_PREFIX + key);
        if (storedCode != null && storedCode.equalsIgnoreCase(inputCode)) {
            captchaStore.remove(CAPTCHA_KEY_PREFIX + key); // 验证成功后删除
            return true;
        }
        return false;
    }

    /**
     * 生成随机验证码
     *
     * @param length 验证码长度
     * @return 随机验证码
     */
    private static String generateRandomCode(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < length; i++) {
            code.append(chars.charAt(random.nextInt(chars.length())));
        }
        return code.toString();
    }

    /**
     * 绘制验证码文字
     *
     * @param g     图形上下文
     * @param code  验证码内容
     */
    private static void drawCaptchaText(Graphics2D g, String code) {
        g.setFont(new Font("Arial", Font.BOLD, 28));
        g.setColor(Color.BLACK);
        Random random = new Random();
        for (int i = 0; i < code.length(); i++) {
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            g.drawString(String.valueOf(code.charAt(i)), 15 + i * 25, 30 + random.nextInt(5));
        }
    }

    /**
     * 绘制干扰线
     *
     * @param g         图形上下文
     * @param lineCount 干扰线条数
     */
    private static void drawLines(Graphics2D g, int lineCount) {
        g.setColor(Color.LIGHT_GRAY);
        Random random = new Random();
        for (int i = 0; i < lineCount; i++) {
            int x1 = random.nextInt(CaptchaConstant.WIDTH);
            int y1 = random.nextInt(CaptchaConstant.HEIGHT);
            int x2 = random.nextInt(CaptchaConstant.WIDTH);
            int y2 = random.nextInt(CaptchaConstant.HEIGHT);
            g.drawLine(x1, y1, x2, y2);
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        // 定义一个唯一的key
        String uniqueKey =  "hxm";

        // 生成验证码
        String captchaBase64= generateCaptcha(uniqueKey);
        System.out.println(captchaBase64);

        // 验证
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入验证码：");
        String userInput = scanner.nextLine();

        boolean isValid = CaptchaUtil.validateCaptcha(uniqueKey, userInput);
        if (isValid) {
            System.out.println("验证码验证通过！");
        } else {
            System.out.println("验证码验证失败！");
        }

    }
}

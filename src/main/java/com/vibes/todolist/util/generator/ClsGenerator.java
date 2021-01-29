package com.vibes.todolist.util.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * 简单的代码生成工具（简单工具，很多符号不做判断，按照说明自己配置，只生成module下面的controller和service）
 *
 * @author lix
 */
public class ClsGenerator {

	/** 自己的工程路径，用/斜线，并以/结尾 */
	private static final String rootPath = "G:/github/tarot/";

	// 自己修改为自己的
	public static class PropEntity {
		// 下面四个属性是必须属性
		public static final String subModule = "admin";
		public static final String classId = "operationLog";
		public static final String classDesc = "用户操作记录管理";
		public static final String author = "lix"; // 自己姓名缩写

		public static String getClassName() {
			return StringUtils.upperCase(StringUtils.substring(PropEntity.classId, 0, 1))
					+ StringUtils.substring(PropEntity.classId, 1, PropEntity.classId.length());
		}

		public static String getYMD() {
			final Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			return String.valueOf(c.get(Calendar.YEAR)) + "-" + String.valueOf(c.get(Calendar.MONTH) + 1) + "-"
					+ String.valueOf(c.get(Calendar.DAY_OF_MONTH));
		}
	}

	public static void main(final String[] args) {

		// 创建文件夹
		ClsGenerator.mkDirs(PropEntity.subModule);

		// create controller
		final String cPath = ClsGenerator.getControllerPath();
		// create service
		final String sPath = ClsGenerator.getServicePath();

		ClsGenerator.createFile(cPath, ClsGenerator.cTemplate);
		System.out.println("controller 生成结束");
		ClsGenerator.createFile(sPath, ClsGenerator.sTemplate);
		System.out.println("service 生成结束");

		System.out.println("生成结束");
	}

	private static String getPath(final String subModule) {
		return ClsGenerator.rootPath + "src/main/java/com/lix/tarot/module/" + subModule;
	}

	private static String getControllerPath() {
		return ClsGenerator.getPath(PropEntity.subModule) + "/controller/" + PropEntity.getClassName()
				+ "Controller.java";
	}

	private static String getServicePath() {
		return ClsGenerator.getPath(PropEntity.subModule) + "/service/" + PropEntity.getClassName() + "Service.java";
	}

	/**
	 * 创建文件夹
	 *
	 * @param subModule
	 *            子模块
	 * @return
	 */
	private static void mkDirs(final String subModule) {
		final String floder = ClsGenerator.getPath(subModule);
		final File file = new File(floder);
		if (file.exists()) {
			file.mkdirs();
		}
	}

	private static void createFile(final String path, final String template) {
		String content = ClsGenerator.readFileContent(template);
		content = ClsGenerator.changeParam(content);
		ClsGenerator.writeFile(path, content);
	}

	private static String changeParam(String content) {
		content = content.replaceAll("\\{class-name\\}", PropEntity.getClassName());
		content = content.replaceAll("\\{author\\}", PropEntity.author);
		content = content.replaceAll("\\{version\\}", ClsGenerator.$VERSION);
		content = content.replaceAll("\\{description\\}", PropEntity.classDesc);
		content = content.replaceAll("\\{history-init\\}", PropEntity.getYMD() + " " + PropEntity.author + " 初始做成");
		content = content.replaceAll("\\{sub-module\\}", PropEntity.subModule);
		content = content.replaceAll("\\{class-id\\}", PropEntity.classId);
		content = content.replaceAll("\\{class-desc\\}", PropEntity.classDesc);

		return content;
	}

	private static void writeFile(final String path, final String content) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write(content);
			writer.flush();

		} catch (final Exception e) {
			System.out.println("文件写入失败， 失败原因：" + e.getMessage());
			e.printStackTrace();

		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String readFileContent(final String path) {
		BufferedReader reader = null;
		final StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new FileReader(path));
			String result = "";

			while ((result = reader.readLine()) != null) {
				sb.append(result + "\r\n");
			}
		} catch (final Exception e) {
			System.out.println("文件读取失败， 失败原因：" + e.getMessage());
			e.printStackTrace();

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}

	/** 不要修改的部分 */
	private static final String $VERSION = "V1.0";
	private static final String cTemplate = rootPath
			+ "src/main/java/com/lix/tarot/util/generator/ControllerTemplate.txt";
	private static final String sTemplate = rootPath + "src/main/java/com/lix/tarot/util/generator/ServiceTemplate.txt";
}

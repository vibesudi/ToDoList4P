/**
 * MpGenerator.java
 *
 * @author SinghLee
 * @version V1.0
 * @description mybatis-plus生成工具
 * @history 20191217 xieyan created
 */
package com.vibes.todolist.util;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * MpGenerator.java
 *
 * @author lix
 */
public final class MpGenerator {

	private final static String URL = "jdbc:mysql://127.0.0.1:3306/tarot?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
	private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "123";

	private final static String AUTHOR = "lix";
	private final static String OUTPUT_DIR = "E:/mybatisplusgenerator/";

	public static void main(final String[] args) {

		final List<TableFill> tableFillList = new ArrayList<>();

		final TableFill cf1 = new TableFill("create_by", FieldFill.INSERT_UPDATE);
		final TableFill cf2 = new TableFill("create_date", FieldFill.INSERT_UPDATE);
		final TableFill cf3 = new TableFill("del_flag", FieldFill.INSERT);
		final TableFill cf4 = new TableFill("update_by", FieldFill.UPDATE);
		final TableFill cf5 = new TableFill("update_date", FieldFill.UPDATE);
		final TableFill cf6 = new TableFill("id", FieldFill.INSERT_UPDATE);

		tableFillList.add(cf1);
		tableFillList.add(cf2);
		tableFillList.add(cf3);
		tableFillList.add(cf4);
		tableFillList.add(cf5);
		tableFillList.add(cf6);

		final AutoGenerator generator = new AutoGenerator();
		generator.setGlobalConfig(MpGenerator.getGlobalConfig());
		generator.setDataSource(MpGenerator.getDataSourceConfig());
		generator.setStrategy(MpGenerator.getStrategyConfig(tableFillList));

		generator.setTemplateEngine(new FreemarkerTemplateEngine());

		final PackageConfig pc = new PackageConfig();
		pc.setParent("com.vibes.todolist.mybatis.plus.generator");
		generator.setPackageInfo(pc);
		generator.execute();
	}

	public static StrategyConfig getStrategyConfig(final List<TableFill> tableFillList) {
		final StrategyConfig sc = new StrategyConfig();
		sc.setNaming(NamingStrategy.underline_to_camel);
		sc.setTableFillList(tableFillList);
		sc.setSuperEntityClass("com.vibes.todolist.mybatis.plus.base.BaseEntity");
		sc.setSuperMapperClass("com.vibes.todolist.mybatis.plus.base.BaseDao");
		sc.setEntityColumnConstant(true);
		sc.setColumnNaming(NamingStrategy.no_change);
		sc.setSuperEntityColumns("id", "create_by", "create_date", "del_flag", "update_by", "update_date");
		return sc;
	}

	public static DataSourceConfig getDataSourceConfig() {
		final DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setTypeConvert(new MySqlTypeConvert() {

		});
		dsc.setUrl(MpGenerator.URL);
		dsc.setDriverName(MpGenerator.DRIVER_NAME);
		dsc.setUsername(MpGenerator.USERNAME);
		dsc.setPassword(MpGenerator.PASSWORD);
		return dsc;
	}

	public static GlobalConfig getGlobalConfig() {
		final GlobalConfig gc = new GlobalConfig();
		// 作者
		gc.setAuthor(MpGenerator.AUTHOR);
		// 输出地址
		gc.setOutputDir(MpGenerator.OUTPUT_DIR);
		// 是否覆盖同名文件，默认是false
		gc.setFileOverride(true);
		// 不需要ActiveRecord特性的请改为false
		gc.setActiveRecord(false);
		// XML 二级缓存
		gc.setEnableCache(false);
		// XML ResultMap
		gc.setBaseResultMap(true);
		// XML columList
		gc.setBaseColumnList(true);
		gc.setEntityName("%sEntity");
		gc.setMapperName("%sDao");
		gc.setXmlName("%sDao");
		return gc;
	}
}

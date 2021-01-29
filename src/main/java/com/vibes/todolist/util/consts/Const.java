package com.vibes.todolist.util.consts;

import java.math.BigDecimal;

public interface Const {

    public interface SpecialUser {
        String RES_ADMIN_ID = "TEA99999999999999999999999999999";
        String PASSWORD = "123456";
    }

    public interface CommonFlag {
        String YES = "1";
        String NO = "0";
    }

    /**
     * 逻辑删除字段
     */
    public interface DelFlag {
        /** "1"删除 */
        String DELETED = "1";
        /** "0"未删除 */
        String NO_DELETED = "0";
    }

    /**
     * 设置当前学期
     */
    public interface setCurrent {
        /** 1设置 */
        String CURRENT_YES = "1";
        /** 0未设置 */
        String CURRENT_NO = "0";
    }

    /**
     * SpecialString：特殊字符串
     *
     * @author SinghLee
     */
    public interface SpecialString {
        String PARAM = "param";
    }

    /**
     * SpecialChar：特殊字符
     *
     * @author SinghLee
     */
    public interface SpecialChar {
        /** 斜线 */
        String OBLIQUE_LINE = "/";
        /** 点 */
        String POINTER = ".";
        /** 中划线 */
        String MID_LINE = "-";
        /** 冒号 */
        String COLON = ":";
    }

    /**
     * jwt生成token用的key
     */
    public interface Claims {
        String KEY = "claims_key";
        String USER_ID = "userId";
        String SCHOOL_ID = "schoolId";
    }

    /**
     * 用户操作记录内容
     */
    public interface OperationLog {
        /** 学校管理 */
        String A002_UPDATE = "学校管理员修改学校信息";
        /** 学期管理 */
        String A003_CREATE = "学校管理员新增系部信息";
        String A003_UPDATE = "学校管理员修改系部信息";
        String A003_DELETE = "学校管理员删除系部信息";
        /** 职务管理 */
        String A004_CREATE = "学校管理员新增职务信息";
        String A004_UPDATE = "学校管理员修改职务信息";
        String A004_DELETE = "学校管理员删除职务信息";
        /** 学年管理 */
        String A005_CREATE = "学校管理员新增学年信息";
        String A005_UPDATE = "学校管理员修改学年信息";
        String A005_DELETE = "学校管理员删除学年信息";
        /** 学期管理 */
        String A006_CREATE = "学校管理员新增学期信息";
        String A006_UPDATE = "学校管理员修改学期信息";
        String A006_DELETE = "学校管理员删除学期信息";
        String A006_SET_CURRENT = "学校管理员设置当前学期";
        /** 教师管理 */
        String A008_CREATE = "学校管理员新增教师信息";
        String A008_UPDATE = "学校管理员修改教师信息";
        String A008_DELETE = "学校管理员删除教师信息";
        String A008_RESET_PASSWORD = "学校管理员重置教师密码";
        /** 专业管理 */
        String A009_CREATE = "学校管理员新增专业信息";
        String A009_UPDATE = "学校管理员修改专业信息";
        String A009_DELETE = "学校管理员删除专业信息";
        /** 班级管理 */
        String A011_CREATE = "学校管理员新增班级信息";
        String A011_UPDATE = "学校管理员修改班级信息";
        String A011_DELETE = "学校管理员删除班级信息";
        String A011_UPDATE_TEACHER = "学校管理员修改班级班主任";
        /** 课程管理 */
        String A012_CREATE = "学校管理员新增课程信息";
        String A012_UPDATE = "学校管理员修改课程信息";
        String A012_DELETE = "学校管理员删除课程信息";
        /** 学生管理 */
        String A013_CREATE = "学校管理员新增学生信息";
        String A013_UPDATE = "学校管理员修改学生信息";
        String A013_DELETE = "学校管理员删除学生信息";
    }

    public interface File {
        String TEMP = "/www/files/temps";
    }

    public interface Path {
        String IMPORT_TEACHER = "/www/files/template/导入教师.xlsx";
        String IMPORT_TEACHER_ERROR = "/www/files/template/导入教师_error.xlsx";
        String IMPORT_CLAZZ = "/www/files/template/导入班级.xlsx";
        String IMPORT_MAJOR = "/www/files/template/导入模板_专业.xls";
        String IMPORT_MAJOR_ERROR = "/www/files/template/export_major.xls";
        String IMPORT_STUDENT = "/www/files/template/导入模板_学生.xls";
        String IMPORT_STUDENT_ERROR = "/www/files/template/export_student.xls";
        String IMPORT_DEPT = "/www/files/template/导入模板_系部.xls";
        String IMPORT_DEPT_ERROR = "/www/files/template/export_dept.xls";
        String IMPORT_QUESTION = "/www/files/template/导入模板_试题.xls";
        String IMPORT_QUESTION_ERROR = "/www/files/template/export_question.xlsx";
    }

    /**
     * 用户职务
     */
    public interface UserJob {
        /** 教师 */
        String TEACHER = "10";
    }

    /**
     * 用户角色
     */
    public interface UserRole {
        /** 学校管理职（校长、教学督导、系主任） */
        String SCHOOL_MAJOR = "22";
        /** 授课教师 */
        String SCHOOL_TEACHER = "23";
    }

    /**
     * 标点符号
     */
    public interface SIGN {
        String COMMA = ",";
        String START = "*";
        String POINT = ".";
        String COLON = ":";
        String SEMICOLON = ";";
        String MINUS = "-";
        String DIAGONAL = "/";
        char DIAGONAL_CHAR = '/';
        String DOUBLE_BACKSLASH = "\\";
    }

    /**
     * 后缀格式
     */
    public interface SUFFIX {
        String FORM_HTML = "html";
        String FORM_HTM = "htm";
        String FORM_SHTML = "shtml";
        String FORM_APK = "apk";
        String FORM_SIS = "sis";
        String FORM_SISX = "sisx";
        String FORM_EXE = "exe";
        String FORM_MSI = "msi";
        String FORM_CSS = "css";
        String FORM_XML = "xml";
        String FORM_GIF = "gif";
        String FORM_JPEG = "jpeg";
        String FORM_JPG = "jpg";
        String FORM_JS = "js";
        String FORM_ATOM = "atom";
        String FORM_RSS = "rss";
        String FORM_MML = "mml";
        String FORM_TXT = "txt";
        String FORM_JAD = "jad";
        String FORM_WML = "wml";
        String FORM_HTC = "htc";
        String FORM_PNG = "png";
        String FORM_TIF = "tif";
        String FORM_TIFF = "tiff";
        String FORM_WBMP = "wbmp";
        String FORM_ICO = "ico";
        String FORM_JNG = "jng";
        String FORM_BMP = "bmp";
        String FORM_SVG = "svg";
        String FORM_JAR = "jar";
        String FORM_VAR = "var";
        String FORM_EAR = "ear";
        String FORM_DOC = "doc";
        String FORM_DOCX = "docx";
        String FORM_PDF = "pdf";
        String FORM_RTF = "rtf";
        String FORM_XLS = "xls";
        String FORM_PPT = "ppt";
        String FORM_PPTX = "pptx";
        String FORM_7Z = "7z";
        String FORM_RAR = "rar";
        String FORM_SWF = "swf";
        String FORM_RPM = "rpm";
        String FORM_DER = "der";
        String FORM_PEM = "pem";
        String FORM_CRT = "crt";
        String FORM_XHTML = "xhtml";
        String FORM_ZIP = "zip";
        String FORM_MID = "mid";
        String FORM_MIDI = "midi";
        String FORM_KAR = "kar";
        String FORM_MP3 = "mp3";
        String FORM_OGG = "ogg";
        String FORM_M4A = "m4a";
        String FORM_RA = "ra";
        String FORM_3GP = "3gp";
        String FORM_3GPP = "3gpp";
        String FORM_MP4 = "mp4";
        String FORM_MPG = "mpg";
        String FORM_MPEG = "mpeg";
        String FORM_MOV = "mov";
        String FORM_FLV = "flv";
        String FORM_M4V = "m4v";
        String FORM_MNG = "mng";
        String FORM_ASF = "asf";
        String FORM_ASX = "asx";
        String FORM_WMV = "wmv";
        String FORM_AVI = "avi";
        String FORM_ODT = "odt";
    }

    /**
     * 文件后缀
     */
    public interface FileSubfix {
        String PNG = "png";
        String JPG = "jpg";
        String JPEG = "jpeg";
        String MP4 = "mp4";
        String PDF = "pdf";
        String SWF = "swf";
        String PNG_WITH_POINT = ".png";
        String JPG_WITH_POINT = ".jpg";
    }

    /**
     * 批量插入默认每次插入数据件数
     */
    public interface BatchSave {
        int SIZE = 100;
    }

    /**
     * 字典类型
     */
    public interface categoryKey {
        /** 学制 */
        String years = "0001";
        /** 性别 */
        String sex = "0002";
    }

    /**
     * 素材热度统计用户表类型
     */
    public interface ResourceHotUseType {
        /** 浏览 */
        int VIEW = 1;
        /** 收藏 */
        int COLLECT = 2;
        /** 下载 */
        int DL = 3;
        /** 使用 */
        int USE = 4;
    }

    /**
     * 试题类型 1单选2多选3判断4填空8会计分录9表格(专业题型)
     */
    public interface ExerciseType {
        String ONE = "00050001";
        String MULTI = "00050002";
        String JUDGE = "00050003";
        String FILL = "00050004";
        String ACCOUNT = "00050005";
        String TABLE = "00050006";
    }

    public interface ExerciseStr {
        String ONE = "单选";
        String MULTI = "多选";
        String JUDGE = "判断";
        String FILL = "填空";
        String ACCOUNT = "会计分录";
        String TABLE = "凭证表格";
    }

    /**
     * 试题默认的一些信息
     */
    public interface ExerDefault {
        /** 默认的评分方式：2：扣分规则（单多判填空无视scoreType） */
        int DEFAULT_SCORE_TYPE = 2;
        /** 默认的难易度：1 */
        int DEFAULT_FACILITY = 1;
        /** 会计分录明细默认分支 */
        BigDecimal DEFAULT_DETAIL_ACCOUNT_SCORE = BigDecimal.valueOf(0.5);
    }

    /**
     * 共通状态
     */
    public interface commonFlg {
        String YES = "1";
        String NO = "0";
    }

    /**
     * 题库默认信息
     */
    public interface ExerBankDefault {
        /** 默认的公开状态：0：私有 */
        int DEFAULT_OPEN_STATUS = 0;
        /** 默认的免费状态:1：免费 */
        int DEFAULT_FREE = 1;
        /** 默认的兑换此题库所需积分：0 */
        int DEFAULT_COIN = 0;
    }

    /**
     * 资源类型key
     */
    public interface ResourceType {
        /** 视频 */
        String VIDEO = "00030001";
        /** 音频 */
        String AUDIO = "00030002";
        /** 图片 */
        String IMAGE = "00030003";
        /** 文档 */
        String DOCUMENT = "00030004";
        /** 文本 */
        String TEXT = "00030005";
        /** 互动游戏 */
        String GAME = "00030006";
        /** 分组任务 */
        String TASK = "00030007";
    }

}

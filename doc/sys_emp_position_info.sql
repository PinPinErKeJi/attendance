--DROP TABLE "sys_emp_position_info";

CREATE TABLE "sys_emp_position_info" (
"id" char(32) NOT NULL,
"emp_id" char(32),
"stat_id" char(32),
"prj_id" char(32),
"record_timestamp" date,
"record_timestamp_start" timestamp(6),
"record_timestamp_end" timestamp(6),
"depict _type" char(1),
"attendance_type" char(1) NOT NULL,
"handle_type" char(1),
"remark" varchar(50),
"create_date" timestamp(6),
"create_id" char(32),
"update_date" timestamp(6),
"update_id" char(32),
PRIMARY KEY ("id") 
)
WITHOUT OIDS;
COMMENT ON TABLE "sys_emp_position_info" IS '考勤异常表';
COMMENT ON COLUMN "sys_emp_position_info"."id" IS 'id';
COMMENT ON COLUMN "sys_emp_position_info"."emp_id" IS '员工id';
COMMENT ON COLUMN "sys_emp_position_info"."stat_id" IS '服务站id';
COMMENT ON COLUMN "sys_emp_position_info"."prj_id" IS '项目id';
COMMENT ON COLUMN "sys_emp_position_info"."record_timestamp" IS '考勤日期';
COMMENT ON COLUMN "sys_emp_position_info"."record_timestamp_start" IS '开始时间(上班打卡只记录开始时间)';
COMMENT ON COLUMN "sys_emp_position_info"."record_timestamp_end" IS '结束时间(下班打卡只记录开始时间)';
COMMENT ON COLUMN "sys_emp_position_info"."depict _type" IS '考勤异常描述：（0：上午迟到 ，2：上午早退， 3：下午迟到,4：下午早退，5：未打卡）';
COMMENT ON COLUMN "sys_emp_position_info"."attendance_type" IS '考勤异常类型：（0：上班打卡异常，1：下班打卡异常，2：项目考勤异常，3：上下班缺勤）';
COMMENT ON COLUMN "sys_emp_position_info"."handle_type" IS '考勤异常处理类型：（0：未记录，1：记录  2：不记录）';
COMMENT ON COLUMN "sys_emp_position_info"."remark" IS '备注';
COMMENT ON COLUMN "sys_emp_position_info"."create_date" IS '创建时间';
COMMENT ON COLUMN "sys_emp_position_info"."create_id" IS '创建者';
COMMENT ON COLUMN "sys_emp_position_info"."update_date" IS '更新时间';
COMMENT ON COLUMN "sys_emp_position_info"."update_id" IS '更新者';


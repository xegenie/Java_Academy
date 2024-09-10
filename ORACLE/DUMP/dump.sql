-- cmd에서 명령어 실행

-- 덤프파일 import
-- imp userid=관리자계정/비밀번호 file=덤프파일경로 fromuser=덤프소유계정 touser=임포트계정
imp userid=system/123456 file=D:\LSJ\ORACLE\DUMP\joeun.dmp fromuser=joeun touser=joeun

-- 덤프파일 export 
exp userid=joeun/123456 file=D:\LSJ\ORACLE\DUMP\community.dmp log=D:\LSJ\ORACLE\DUMP\community.log
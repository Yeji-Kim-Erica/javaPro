package days11git;

/**
 * @author kenik
 * @date 2025. 2. 17. - 오전 7:44:29
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 월요일 Git 수업~
		/*
		 * 1. https://git-scm.com/
		 *     ㄴ Git-2.48.1-64-bit.exe
		 *    https://git-scm.com/book/ko/v2
		 * 2. https://code.visualstudio.com/
		 *     ㄴ VSCodeUserSetup-x64-1.97.2.exe
		 * 
		 * 캡처도구
		 * 3. https://git-scm.com/book/ko/v2 개념 설명 
		 * 3-2. Git 설치     
		 * 
		 * 4. 테스트용 폴더 생성
		 *   1) 교육원에서 작업 폴더라고 가정 
		 *     ㄴ C:\Class\GitTest\SiSt-JavaClass    
		 *   2) 집에서 작업 폴더라고 가정
		 *     ㄴ C:\Class\GitTest\Home-JavaClass 
		 *     
		 * 5. 
		 * user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git
		usage: git [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]
		           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
		           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
		           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
		           [--config-env=<name>=<envvar>] <command> [<args>]
		:
		'git help -a' and 'git help -g' list available subcommands and some
		concept guides. See 'git help <command>' or 'git help <concept>'
		to read about a specific subcommand or concept.
		See 'git help git' for an overview of the system.
		
		user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git help config

[깃 버전 확인]
     user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git --version
		git version 2.45.2.windows.1
[사용자 정보 확인]
		user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git config --list
		diff.astextplain.textconv=astextplain
		filter.lfs.clean=git-lfs clean -- %f
		filter.lfs.smudge=git-lfs smudge -- %f
		filter.lfs.process=git-lfs filter-process
		filter.lfs.required=true
		http.sslbackend=openssl
		http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
		core.autocrlf=true
		core.fscache=true
		core.symlinks=false
		pull.rebase=false
		credential.helper=manager
		credential.https://dev.azure.com.usehttppath=true
		init.defaultbranch=main
		user.name=withkenik
		user.email=withkenik@gmail.com
		
		user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git config user.name
		withkenik

[사용자 정보 등록] 
		user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
		$ git config --global user.name "withkenik"
        $ git config --global user.email withkenik@gmail.com
        
[원격(remote) 저장소 확인] X GitHub X
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
	$ git remote -v
	fatal: not a git repository (or any of the parent directories): .git

[로컬 저장소 생성]
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass
	$ git init
	Initialized empty Git repository in C:/E/Class/SS23Class/GitTest/SiSt-JavaClass/.git/
[VS Code 실행]
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$ code .

[VS Code  ]
Hell.java
Hello World!!!

[git 상태 확인]
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$ git status
	On branch main
	
	No commits yet
	
	Untracked files:
	  (use "git add <file>..." to include in what will be committed)
	        Hello.class
	        Hello.java
	
	nothing added to commit but untracked files present (use "git add" to track)
	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$

[git 관리 대상 X 설정] .gitignore 파일 추가
	*.class
	.metadata/
	/bin/

[git status 확인]
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$ git status
	On branch main
	
	No commits yet
	
	Untracked files:
	  (use "git add <file>..." to include in what will be committed)
	        .gitignore
	        Hello.java
	
	nothing added to commit but untracked files present (use "git add" to track)
	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$


[ .gitignore 파일에 입력하는 패턴은 아래 규칙을 따른다.]
	아무것도 없는 라인이나, # 로 시작하는 라인은 무시한다.
	표준 Glob 패턴을 사용한다. 이는 프로젝트 전체에 적용된다.
	슬래시(/)로 시작하면 하위 디렉토리에 적용되지(Recursivity) 않는다.
	디렉토리는 슬래시(/)를 끝에 사용하는 것으로 표현한다.
	느낌표(!)로 시작하는 패턴의 파일은 무시하지 않는다.	
	
[첫 커밋]
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$ git add .
	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$ git status
		On branch main
		
		No commits yet
		
		Changes to be committed:
		  (use "git rm --cached <file>..." to unstage)
		        new file:   .gitignore
		        new file:   Hello.java
	
	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
		$ git commit -m "first commit test"
		[main (root-commit) 476c7ee] first commit test
		 2 files changed, 10 insertions(+)
		 create mode 100644 .gitignore
		 create mode 100644 Hello.java
	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
		$ git status
		On branch main
		nothing to commit, working tree clean
	
[브랜치 생성]	
	user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
	$
		
$ git branch foo

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git branch
  foo
* main

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git checkout foo
Switched to branch 'foo'

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ echo "foo 브랜치 작업" foo.txt
foo 브랜치 작업 foo.txt

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git status
On branch foo
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        foo.txt

nothing added to commit but untracked files present (use "git add" to track)

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git checkout main
Switched to branch 'main'

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        foo.txt

nothing added to commit but untracked files present (use "git add" to track)

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git checkout foo
Switched to branch 'foo'

[]
user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git add foo.txt

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git status
On branch foo
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   foo.txt


user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git commit -m "foo/ foo.txt create"
[foo 68b943e] foo/ foo.txt create
 1 file changed, 1 insertion(+)
 create mode 100644 foo.txt

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$
	
[]	

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git log
commit 68b943ea283a678184f4de174b35f91483557f4d (HEAD -> foo)
Author: withkenik <withkenik@gmail.com>
Date:   Mon Feb 17 12:10:56 2025 +0900

    foo/ foo.txt create

commit 476c7ee71d16c22de8f23e23f697c00356a1e1cf (main)
Author: withkenik <withkenik@gmail.com>
Date:   Mon Feb 17 11:51:50 2025 +0900

    first commit test

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (foo)
$ git checkout main
Switched to branch 'main'

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git log
commit 476c7ee71d16c22de8f23e23f697c00356a1e1cf (HEAD -> main)
Author: withkenik <withkenik@gmail.com>
Date:   Mon Feb 17 11:51:50 2025 +0900

    first commit test

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$

	 []
user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git merge foo
Updating 476c7ee..68b943e
Fast-forward
 foo.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 foo.txt

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git log
commit 68b943ea283a678184f4de174b35f91483557f4d (HEAD -> main, foo)
Author: withkenik <withkenik@gmail.com>
Date:   Mon Feb 17 12:10:56 2025 +0900

    foo/ foo.txt create

commit 476c7ee71d16c22de8f23e23f697c00356a1e1cf
Author: withkenik <withkenik@gmail.com>
Date:   Mon Feb 17 11:51:50 2025 +0900

    first commit test

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$


   []
user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git branch -D foo
Deleted branch foo (was 68b943e).

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git branch
* main

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$
   
   [6. GitHub 계정 생성] https://github.com
   
   []
user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git branch -D foo
Deleted branch foo (was 68b943e).

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git branch
* main

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ echo "# javaPro" >> README.md

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git add README.md
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git commit -m "remote .. first commit"
[main 2c98ad6] remote .. first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$

    []
user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git remote add origin https://github.com/withkenik/javaPro.git

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git remote -v
origin  https://github.com/withkenik/javaPro.git (fetch)
origin  https://github.com/withkenik/javaPro.git (push)

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Hello.java

no changes added to commit (use "git add" and/or "git commit -a")

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git add Hello.java

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git commit -m "modifed ~~~ add"
[main 19fdee7] modifed ~~~ add
 1 file changed, 1 insertion(+), 1 deletion(-)

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$

 []
 user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git remote -v
origin  https://github.com/withkenik/javaPro.git (fetch)
origin  https://github.com/withkenik/javaPro.git (push)

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git push -u origin main
Enumerating objects: 13, done.
Counting objects: 100% (13/13), done.
Delta compression using up to 24 threads
Compressing objects: 100% (10/10), done.
Writing objects: 100% (13/13), 1.03 KiB | 1.03 MiB/s, done.
Total 13 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (4/4), done.
To https://github.com/withkenik/javaPro.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
   
   
   https://kabkee.github.io/git/git-password-store/
   
   https://blog.naver.com/zzol3/223711677774
   
   토큰 생성 후 저장 : ghp_quyro0KC0c~~~~~~
   
   []
   user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git remote remove originuser@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/SiSt-JavaClass (main)
$ git remote remove origin

$   git remote -v
   
   [다시 원격 저장소 origin 설정]
$ git remote set-url origin https://ghp_quyro0KC0c~~~~~~@github.com/withkenik/javaPro.git 
$ git remote add origin https://ghp_quyro0KC0c~~~~~~@github.com/withkenik/javaPro.git


------------------------------------------------------------
[집이라 가정]
C:\E\Class\SS23Class\GitTest\Home-JavaClass 폴더로 이동
 로컬저장소 X
 1. Git 설치
 2. 사용자 정보 등록 
 3. 원격 origin 등록
 4. 로컬 저장소
 
 user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/Home-JavaClass
$ git clone https://github.com/withkenik/javaPro.git
Cloning into 'javaPro'...
remote: Enumerating objects: 13, done.
remote: Counting objects: 100% (13/13), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 13 (delta 4), reused 13 (delta 4), pack-reused 0 (from 0)
Receiving objects: 100% (13/13), done.
Resolving deltas: 100% (4/4), done.

user@DESKTOP-8JCVOFE MINGW64 /c/E/Class/SS23Class/GitTest/Home-JavaClass
$


* */

	} // main/

} // class

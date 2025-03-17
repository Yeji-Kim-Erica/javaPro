package Tennis;

import java.util.Scanner;

class Player {
    String teamA; // A선수명(단식) / A팀(복식)
    String teamB; // B선수명(단식) / B팀(복식)

    // 복식에서만 사용되는 선수명 변수
    String a1, a2, b1, b2;
    
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    String[] exp = {
        "> 단식/복식 입력 (단식: 1, 복식: 2) : ", 
        "> 세트 타입 입력 (어드밴티지 세트: 1, 타이브레이크 세트: 2) : ",
        "> 마지막 세트 타입 입력 (어드밴티지 세트: 1, 타이브레이크 세트: 2) : ",
        "> 3판2선승제 / 5판3선승제 입력 (3판2선승제 : 3, 5판3선승제: 5) : "
    };

    int matchType;
    int setType;
    int lastSetType;
    int setCount;
    String content;

    // 생성자에서 초기화 및 실행 로직 처리
    public Player() {
        matchType = getMatchType(sc, exp[0], sb);
        setType = getMatchType(sc, exp[1], sb);
        lastSetType = getMatchType(sc, exp[2], sb);
        setCount = getSetCount(sc, sb);

        if (matchType == 1) {
            setSingle(sc);
        } else {
            setDouble(sc);
        }
        
    }

    public String getTeamA() {
		return teamA;
	}

	public String getTeamB() {
		return teamB;
	}


	public String getA1() {
		return a1;
	}

	public String getA2() {
		return a2;
	}

	public String getB1() {
		return b1;
	}

	public String getB2() {
		return b2;
	}

	public int getMatchType() {
		return matchType;
	}

	public int getSetType() {
		return setType;
	}

	public int getLastSetType() {
		return lastSetType;
	}

	public int getSetCount() {
		return setCount;
	}
	
	public StringBuilder getSb() {
		return sb;
	}

	public String getContent() {
		return sb.toString();
	}

	private int getMatchType(Scanner sc, String exp, StringBuilder sb) {
        System.out.print(exp);
        int wrong = 0;
        String result;
        do {
            if (wrong++ != 0) {
                System.out.print("[경고] 올바른 입력 아닙니다. 1 또는 2를 입력해주세요.\n");
            }
            result = sc.nextLine().trim();
        } while (!result.matches("1|2"));
        sb.append(exp + result + "\n");
        return Integer.parseInt(result);
        
    }

    private int getSetCount(Scanner sc, StringBuilder sb) {
        System.out.print(exp[3]);
        int wrong = 0;
        String result;
        do {
            if (wrong++ != 0) {
                System.out.print("[경고] 올바른 입력 아닙니다. 3 또는 5를 입력해주세요.\n");
            }
            result = sc.nextLine().trim();
        } while (!result.matches("3|5"));
        sb.append(exp[3] + result + "\n");
        return Integer.parseInt(result);
    }

    private void setDouble(Scanner sc) {
        System.out.print("> 첫번째 팀 입력 : ");
        teamA = sc.nextLine().trim();
        sb.append("> 첫번째 팀 입력 : " + teamA + "\n");
        
        System.out.print("  >> 첫번째 선수 입력 : ");
        a1 = sc.nextLine().trim();
        sb.append("  > 첫번째 선수 입력 : " + a1 + "\n");
        
        System.out.print("  >> 두번째 선수 입력 : ");
        a2 = sc.nextLine().trim();
        sb.append("  >> 두번째 선수 입력 : " + a2 + "\n");
        
        System.out.print("> 두번째 팀 입력 : ");
        teamB = sc.nextLine().trim();
        sb.append("> 두번째 팀 입력 : " + teamB + "\n");
        
        System.out.print("  >>첫번째 선수 입력 : ");
        b1 = sc.nextLine().trim();
        sb.append("  >>첫번째 선수 입력 : " + b1 + "\n");
        
        System.out.print("  >>두번째 선수 입력 : ");
        b2 = sc.nextLine().trim();
        sb.append("  >>두번째 선수 입력 : " + b2 + "\n");
    }

    private void setSingle(Scanner sc) {
        System.out.print("> 첫번째 선수 입력 : ");
        teamA = sc.nextLine().trim();
        sb.append("> 첫번째 선수 입력 : " + teamA + "\n");
        
        System.out.print("> 두번째 선수 입력 : ");
        teamB = sc.nextLine().trim();
        sb.append("> 두번째 선수 입력 : " + teamB + "\n");
    }
}

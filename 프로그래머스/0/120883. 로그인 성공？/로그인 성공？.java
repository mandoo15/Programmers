/*
머쓱이는 프로그래머스에 로그인
입력한 아이디, 패스워드가 담긴 배열 id_pw
회원들의 정보가 담긴 2차원 배열 db
로그인 성공, 실패에 따른 메시지를 return
- 아이디와 비밀번호 모두 일치하는 회원정보가 있으면 "login" return
- 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 "fail" return
- 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 "wrong pw" return
*/
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i=0; i<db.length; i++){ // 행 길이
            if(id_pw[0].equals(db[i][0])){
                    if(id_pw[1].equals(db[i][1])){
                        answer = "login";
                    }
                    else {
                        answer = "wrong pw";
                    }
            }
        }
        return answer;
    }
}
package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    /***
     * 문자열 s 중에서 알파벳 수를 리턴하는 메소드
     * @param s
     * @return
     * @throws CharCheckException
     */
    public int countAlpha(String s) throws CharCheckException {

        if(s.indexOf(" ")  > - 1)
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i)))
                cnt++;
        }

        return cnt;
    }
}
/*
문자열 numbers 매개변수
numbers의 영어를 정수로 바꿔 return
one - 1 이런식으로
-> HOW?
replace 사용
*/
class Solution {
    public long solution(String numbers) {
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        long answer = Long.parseLong(numbers);
        return answer;
    }
}
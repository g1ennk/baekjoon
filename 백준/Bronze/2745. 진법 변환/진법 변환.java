// package ktb.morningStudy._250422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        System.out.println(Integer.parseInt(N, B));
    }
}

/*
1. Integer.parseInt()
1. Integer.parseInt()
- 일반적으로 문자열을 정수로 변환할 때 사용되는 메서드이다. 예: "25" → 25
- 오버로딩된 메서드인 int Integer.parseInt(String s, int radix)를 사용하면,
  문자열 s를 주어진 진법(radix)을 기준으로 10진수 정수로 변환할 수 있다.
- 예를 들어, Integer.parseInt("A", 16) → 10, Integer.parseInt("1010", 2) → 10
- 지원하는 진법 범위는 2진수부터 36진수까지이다.
 */
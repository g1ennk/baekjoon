import java.util.*;

// 통계확
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 수의 개수 입력 받기
        int N = sc.nextInt(); // N은 홀수 개

        // 2. 모든 수 입력받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Statistics statistics = new Statistics();

        // 3. 산술평균 계산 및 출력
        System.out.println(statistics.calculateArithmeticMean(arr));

        // 4. 중안값 계산 및 출력
        System.out.println(statistics.calculateMedian(arr));

        // 5. 최빈값 계산 및 출력
        System.out.println(statistics.calculateMode(arr));

        // 6. 범위 계산 및 출력
        System.out.println(statistics.calculateRange(arr));
    }


}

class Statistics {
    public int calculateArithmeticMean(int[] arr) {
        int total = 0;
        for (int element : arr) {
            total += element;
        }

        return (int) Math.round((double) total / arr.length);
    }

    public int calculateMedian(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedArr);

        return sortedArr[sortedArr.length / 2];
    }

    public int calculateMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // 값, 빈도
        int maxFrequency = 0;
        List<Integer> modeList = new ArrayList<>(); // 최빈값 리스트

        // 순회하며 배열에 있는 값을 맵에 넣기
        for (int element : arr) {
            int frequency = map.getOrDefault(element, 0) + 1; // 빈도
            map.put(element, frequency);
            // 최대 빈도 수 업데이트
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // 최빈값 구하기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeList.add(entry.getKey());
            }
        }

        // (최빈 값이 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.)
        Collections.sort(modeList);
        if (modeList.size() > 1) {
            return modeList.get(1);
        } else {
            return modeList.get(0);
        }
    }

    public int calculateRange(int[] arr) {
        // 성능측면에선 stream보다 순회가 더 낫다.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }
}


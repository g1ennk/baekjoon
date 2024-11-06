import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 해시맵 초기화
        HashMap<String, Integer> totalMap = new HashMap<>(); // genre -> totalPlays
        HashMap<String, List<int[]>> songMap = new HashMap<>(); // genre -> songList
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            totalMap.put(genre, totalMap.getOrDefault(genre, 0) + play);
            songMap.putIfAbsent(genre, new ArrayList<>());
            songMap.get(genre).add(new int[]{i, play});
        }

        // 2. 장르별 총 횟수에 따라 정렬
        List<String> genreOrder = new ArrayList<>(songMap.keySet());
        genreOrder.sort((a,b) -> totalMap.get(b) - totalMap.get(a));

        // 3. 정렬된 장르 순서에 따라 노래들도 정렬
        List<Integer> topSongList = new ArrayList<>();
        for(String genre : genreOrder) {
            List<int[]> songs = songMap.get(genre);
            songs.sort((a,b) -> b[1] - a[1]); // 노래 정렬
            
            topSongList.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                topSongList.add(songs.get(1)[0]);
            }
        }

        return topSongList.stream().mapToInt(i -> i).toArray();
    }
}
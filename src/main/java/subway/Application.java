package subway;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Map<Line, List<Station>> map = setting();


        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현

        try {
            Line line = new Line("2호선");
            line.addItem(new Station("잠실역"));
            line.addItemAtIndex(0,new Station("동탄역"));
            LineRepository.addLine(line);

            for (Line liner : LineRepository.lines()){
                for (Station stationer : liner.getItemList()){
                    System.out.println(stationer.getName());
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private static Map<Line, List<Station>> setting() {

        Map<Line, List<Station>> map= new HashMap<>() {
            {
                put(new Line("2호선"),
                        new ArrayList<>(Arrays.asList(
                                new Station("교대역"),
                                new Station("강남역"),
                                new Station("역삼역")))
                );
                put(new Line("3호선"),
                        new ArrayList<>(Arrays.asList(
                                new Station("교대역"),
                                new Station("남부터미널역"),
                                new Station("양재역"),
                                new Station("매봉역")))
                );
                put(new Line("신분당선"),
                        new ArrayList<>(Arrays.asList(
                                new Station("강남역"),
                                new Station("양재역"),
                                new Station("양재시민의숲역"))
                        )
                );

            }
        };
        return map;
    }
}

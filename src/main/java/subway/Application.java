package subway;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
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
}

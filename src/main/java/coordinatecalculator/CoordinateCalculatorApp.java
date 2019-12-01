package coordinatecalculator;

import coordinatecalculator.controller.CoordinateCalculatorController;
import coordinatecalculator.view.ConsoleInputView;
import coordinatecalculator.view.ConsoleOutputView;
import coordinatecalculator.view.InputView;
import coordinatecalculator.view.OutputView;

public class CoordinateCalculatorApp {

    public static void main(String[] args) {
        InputView inputView = new ConsoleInputView();
        OutputView outputView = new ConsoleOutputView();

        CoordinateCalculatorController controller = new CoordinateCalculatorController(inputView, outputView);
        try {
            controller.start();
        } catch (RuntimeException e) {
            outputView.printErrorMessage(e);
        }
    }
}

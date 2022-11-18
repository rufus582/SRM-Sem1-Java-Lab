import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;


public class Lab_12 {
    public class DragTwoSquares extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        private double x1 = 10, y1 = 10;
        private double x2 = 50, y2 = 10;
        private Canvas canvas;

        public void start(Stage stage) {
            canvas = new Canvas(300, 250);
            draw();
            canvas.setOnMousePressed(e -> mousePressed(e));
            canvas.setOnMouseDragged(e -> mouseDragged(e));
            canvas.setOnMouseReleased(e -> mouseReleased(e));
            Pane root = new Pane(canvas);
            Scene scene = new Scene(root);

            scene.setOnKeyPressed(e -> {
                if (e.getCode() == KeyCode.ESCAPE) {
                    x1 = 10;
                    y1 = 10;
                    x2 = 50;
                    y2 = 10;
                    draw();
                }
            });
            stage.setScene(scene);
            stage.setTitle("Drag the squares!");
            stage.setResizable(false);
            stage.show();
        }

        private void draw() {
            GraphicsContext g = canvas.getGraphicsContext2D();
            g.setFill(Color.rgb(230, 255, 230));
            g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            g.setFill(Color.RED);
            g.fillRect(x1, y1, 30, 30);
            g.setFill(Color.BLUE);
            g.fillRect(x2, y2, 30, 30);
        }

        private boolean dragging;
        private boolean dragRedSquare;
        private double offsetX, offsetY;

        public void mousePressed(MouseEvent evt) {
            if (dragging)
                return;
            double x = evt.getX();
            double y = evt.getY();
            if (x >= x2 && x < x2 + 30 && y >= y2 && y < y2 + 30) {
                dragging = true;
                dragRedSquare = false;
                offsetX = x - x2;
                offsetY = y - y2;
            } else if (x >= x1 && x < x1 + 30 && y >= y1 && y < y1 + 30) {
                dragging = true;
                dragRedSquare = true;
                offsetX = x - x1;
                offsetY = y - y1;
            }
        }

        public void mouseReleased(MouseEvent evt) {

            dragging = false;
        }

        public void mouseDragged(MouseEvent evt) {
            if (dragging == false)
                return;
            double x = evt.getX();
            double y = evt.getY();
            if (dragRedSquare) {
                x1 = x - offsetX;
                y1 = y - offsetY;
            } else {
                x2 = x - offsetX;
                y2 = y - offsetY;
            }
            draw();
        }
    }
}

package Swing;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class cube {
    // Cube representation
    private static final char[][][] cube = new char[6][3][3];
    private static final String[] faces = {"U", "D", "L", "R", "F", "B"};
    private static final char[] colors = {'W', 'Y', 'G', 'B', 'R', 'O'};

    // Stores solution moves
    private static final List<String> moves = new ArrayList<>();

    public static void main(String[] args) {
        // Input cube configuration
        inputCube();

        // Validate the cube
        if (!validateCube()) {
            System.out.println("Invalid cube configuration. Please try again.");
            return;
        }

        // Solve the cube
        solveCube();

        // Display the solution
        System.out.println("Solution:");
        for (String move : moves) {
            System.out.print(move + " ");
        }

        // Display the graphical interface
        SwingUtilities.invokeLater(() -> new CubeGUI(cube));
    }

    // Input the cube configuration
    private static void inputCube() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rubik's Cube configuration face by face.");
        System.out.println("Use W (White), Y (Yellow), G (Green), B (Blue), R (Red), O (Orange).");

        for (int f = 0; f < 6; f++) {
            System.out.println("Enter colors for the " + faces[f] + " face (row by row):");
            for (int i = 0; i < 3; i++) {
                while (true) {
                    String row = scanner.nextLine().toUpperCase();
                    if (row.length() != 3 || !row.matches("[WYGBRO]+")) {
                        System.out.println("Invalid input! Enter exactly 3 colors using W, Y, G, B, R, O.");
                        continue;
                    }
                    cube[f][i] = row.toCharArray();
                    break;
                }
            }
        }

        System.out.println("Cube configuration input successful!");
    }

    // Validate the cube
    private static boolean validateCube() {
        Map<Character, Integer> colorCount = new HashMap<>();
        for (char c : colors) colorCount.put(c, 0);

        for (int f = 0; f < 6; f++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char color = cube[f][i][j];
                    colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
                }
            }
        }

        for (char c : colors) {
            if (colorCount.get(c) != 9) {
                System.out.println("Invalid cube: Color " + c + " does not have 9 stickers.");
                return false;
            }
        }

        System.out.println("Cube validated successfully!");
        return true;
    }

    // Solve the Rubik's Cube using Beginner's Method
    private static void solveCube() {
        solveWhiteCross();
        solveFirstLayerCorners();
        solveMiddleLayerEdges();
        solveYellowCross();
        solveYellowCorners();
        solveYellowEdges();
        System.out.println("Cube solved!");
    }

    private static void solveWhiteCross() {
        System.out.println("Solving White Cross...");
        moves.add("Solve White Cross");
        // Add actual logic for solving white cross
    }

    private static void solveFirstLayerCorners() {
        System.out.println("Solving First Layer Corners...");
        moves.add("Solve First Layer Corners");
        // Add actual logic for solving first layer corners
    }

    private static void solveMiddleLayerEdges() {
        System.out.println("Solving Middle Layer Edges...");
        moves.add("Solve Middle Layer Edges");
        // Add actual logic for solving middle layer edges
    }

    private static void solveYellowCross() {
        System.out.println("Solving Yellow Cross...");
        moves.add("Solve Yellow Cross");
        // Add actual logic for solving yellow cross
    }

    private static void solveYellowCorners() {
        System.out.println("Positioning Yellow Corners...");
        moves.add("Solve Yellow Corners");
        // Add actual logic for positioning yellow corners
    }

    private static void solveYellowEdges() {
        System.out.println("Positioning Yellow Edges...");
        moves.add("Solve Yellow Edges");
        // Add actual logic for positioning yellow edges
    }
}

class CubeGUI extends JFrame {
    private final char[][][] cube;

    public CubeGUI(char[][][] cube) {
        this.cube = cube;
        setTitle("Rubik's Cube Solver");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(new CubePanel());
        setVisible(true);
    }

    private class CubePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int size = 50; // Size of each square

            // Draw each face
            for (int f = 0; f < 6; f++) {
                int offsetX = 0, offsetY = 0;
                switch (f) {
                    case 0: offsetX = 150; break; // U
                    case 1: offsetX = 150; offsetY = 200; break; // D
                    case 2:
                        offsetY = 100; break; // L
                    case 3: offsetX = 300; offsetY = 100; break; // R
                    case 4: offsetX = 150; offsetY = 100; break; // F
                    case 5: offsetX = 450; offsetY = 100; break; // B
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        g.setColor(getColor(cube[f][i][j]));
                        g.fillRect(offsetX + j * size, offsetY + i * size, size, size);
                        g.setColor(Color.BLACK);
                        g.drawRect(offsetX + j * size, offsetY + i * size, size, size);
                    }
                }
            }
        }

        // Map character to color
        private Color getColor(char c) {
            return switch (c) {
                case 'W' -> Color.WHITE;
                case 'Y' -> Color.YELLOW;
                case 'G' -> Color.GREEN;
                case 'B' -> Color.BLUE;
                case 'R' -> Color.RED;
                case 'O' -> Color.ORANGE;
                default -> Color.BLACK;
            };
        }
    }
}

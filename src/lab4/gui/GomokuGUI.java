package lab4.gui;

import lab4.client.GomokuClient;
import lab4.data.GomokuGameState;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GomokuGUI implements Observer {
    public GomokuGUI(GomokuClient gomokoClient, GomokuGameState gameState) {
//        JFrame frame = new JFrame("Gomoku");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.setLayout(new BorderLayout());
//
//        JPanel gameGridPanel = new GamePanel(gameState.getGameGrid());
//
//        JButton connectButton = new JButton("Connect");
//        JButton newGameButton = new JButton("New Game");
//        JButton disconnectButton = new JButton("Disconnect");
//
//        gameGridPanel.add(connectButton);
//        gameGridPanel.add(disconnectButton);
//        gameGridPanel.add(newGameButton);
//
//
//        frame.add(gameGridPanel);
//
//        frame.setContentPane(gameGridPanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

        new ConnectionWindow(gomokoClient);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}

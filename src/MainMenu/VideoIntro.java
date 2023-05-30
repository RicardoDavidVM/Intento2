package MainMenu;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class VideoIntro extends JFrame {

    VideoIntro() throws IOException {

        JFrame PaginaIntro = new JFrame();
        ImageIcon icono = new ImageIcon("Logo2.PNG");
        PaginaIntro.setIconImage(icono.getImage());
        PaginaIntro.setTitle("DUNGEONS OF LEGENDS");
        PaginaIntro.setLayout(null);
        PaginaIntro.setSize(1000,800);
        PaginaIntro.setResizable(false);
        PaginaIntro.setLocationRelativeTo(null);
        PaginaIntro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        InputStream videoStream = getClass().getResourceAsStream("animated-bilgewater.mp4");
        File tempFile = File.createTempFile("video", ".mp4");
        tempFile.deleteOnExit();
        Files.copy(videoStream,tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        String filePath = tempFile.toURI().toString();

        Media media = new Media(filePath);
        MediaPlayer player = new MediaPlayer(media);

        MediaView mediaView = new MediaView(player);

        PaginaIntro.setVisible(true);
        player.play();

    }
}

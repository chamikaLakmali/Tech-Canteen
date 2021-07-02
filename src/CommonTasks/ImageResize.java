/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Chamika
 */
public class ImageResize {
    public static ImageIcon  resize(String path,int height,int width) {
        ImageIcon avatarImage = new ImageIcon(path);
        java.awt.Image img = avatarImage.getImage();
        java.awt.Image newImage = img.getScaledInstance(width, height, img.SCALE_SMOOTH);
        
        ImageIcon scaledImage = new ImageIcon(newImage);
        return scaledImage;

    }
    public static ImageIcon resizeImg(ImageIcon photo) {
        
        Image img = photo.getImage();
        Image newImage = img.getScaledInstance(160, 160, img.SCALE_SMOOTH);
        ImageIcon scaledImage = new ImageIcon(newImage);
        return scaledImage;
    }
}

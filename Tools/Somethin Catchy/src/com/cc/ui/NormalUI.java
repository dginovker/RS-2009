/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc.ui;

import com.cc.Main;
import com.cc.tools.NormalPack;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author travis
 */
public class NormalUI extends javax.swing.JFrame {

    /**
     * Creates new form NormalUI
     */
    public NormalUI() {
        setTitle("Normal Cache Packing - Somethin Catchy");
        setResizable(false);
        redirectSystemStreams();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backToMainButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        skeletons = new javax.swing.JCheckBox();
        skins = new javax.swing.JCheckBox();
        config = new javax.swing.JCheckBox();
        interfaces = new javax.swing.JCheckBox();
        soundEffects = new javax.swing.JCheckBox();
        maps = new javax.swing.JCheckBox();
        music = new javax.swing.JCheckBox();
        models = new javax.swing.JCheckBox();
        sprites = new javax.swing.JCheckBox();
        textures = new javax.swing.JCheckBox();
        huffmanEncoding = new javax.swing.JCheckBox();
        interfaceScripts = new javax.swing.JCheckBox();
        fonts = new javax.swing.JCheckBox();
        objects = new javax.swing.JCheckBox();
        clientscripts = new javax.swing.JCheckBox();
        npcs = new javax.swing.JCheckBox();
        items = new javax.swing.JCheckBox();
        animations = new javax.swing.JCheckBox();
        graphics = new javax.swing.JCheckBox();
        clientVarpBits = new javax.swing.JCheckBox();
        worldMap = new javax.swing.JCheckBox();
        qcMessages = new javax.swing.JCheckBox();
        qcMenus = new javax.swing.JCheckBox();
        nativeLibs = new javax.swing.JCheckBox();
        graphicShaders = new javax.swing.JCheckBox();
        p11FontsImages = new javax.swing.JCheckBox();
        gameTips = new javax.swing.JCheckBox();
        theora = new javax.swing.JCheckBox();
        vorbis = new javax.swing.JCheckBox();
        mapEffects = new javax.swing.JCheckBox();
        index29 = new javax.swing.JCheckBox();
        graphicConfigurations = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        addOption1 = new javax.swing.JCheckBox();
        addOption2 = new javax.swing.JCheckBox();
        addOption0 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        packButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backToMainButton.setText("Back to Main UI");
        backToMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cc/ui/normalcachepacking.png"))); // NOI18N

        skeletons.setText("Skeletons");

        skins.setText("Skins");

        config.setText("Config");

        interfaces.setText("Interfaces");

        soundEffects.setText("Sound Effects");

        maps.setText("Maps");

        music.setText("Music");

        models.setText("Models");

        sprites.setText("Sprites");

        textures.setText("Textures");

        huffmanEncoding.setText("Huffman Encoding");

        interfaceScripts.setText("Interface Scripts");

        fonts.setText("Fonts");

        objects.setText("Objects");

        clientscripts.setText("Clientscripts");

        npcs.setText("NPCs");

        items.setText("Items");

        animations.setText("Animations");

        graphics.setText("Graphics");

        clientVarpBits.setText("ClientVarpBits");

        worldMap.setText("World Map");

        qcMessages.setText("QC Messages");

        qcMenus.setText("QC Menus");

        nativeLibs.setText("Native Libs");

        graphicShaders.setText("Graphic Shaders");

        p11FontsImages.setText("P11 Fonts/Images");

        gameTips.setText("Game Tips");

        theora.setText("Theora");

        vorbis.setText("Vorbis");

        mapEffects.setText("Map Effects");

        index29.setText("Index 29");

        graphicConfigurations.setText("Graphic Configurations");
        graphicConfigurations.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skeletons)
                    .addComponent(skins)
                    .addComponent(config)
                    .addComponent(interfaces)
                    .addComponent(soundEffects)
                    .addComponent(maps)
                    .addComponent(music)
                    .addComponent(models)
                    .addComponent(sprites)
                    .addComponent(textures))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(huffmanEncoding)
                    .addComponent(interfaceScripts)
                    .addComponent(fonts)
                    .addComponent(objects)
                    .addComponent(clientscripts)
                    .addComponent(npcs)
                    .addComponent(items)
                    .addComponent(animations)
                    .addComponent(graphics)
                    .addComponent(clientVarpBits))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mapEffects)
                    .addComponent(vorbis)
                    .addComponent(theora)
                    .addComponent(gameTips)
                    .addComponent(p11FontsImages)
                    .addComponent(graphicShaders)
                    .addComponent(nativeLibs)
                    .addComponent(qcMenus)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(worldMap)
                            .addComponent(qcMessages))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graphicConfigurations)
                            .addComponent(index29))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skeletons)
                    .addComponent(huffmanEncoding)
                    .addComponent(worldMap)
                    .addComponent(index29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skins)
                    .addComponent(interfaceScripts)
                    .addComponent(qcMessages)
                    .addComponent(graphicConfigurations))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(config)
                    .addComponent(fonts)
                    .addComponent(qcMenus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interfaces)
                    .addComponent(objects)
                    .addComponent(nativeLibs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soundEffects)
                    .addComponent(clientscripts)
                    .addComponent(graphicShaders))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maps)
                    .addComponent(npcs)
                    .addComponent(p11FontsImages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(music)
                    .addComponent(items)
                    .addComponent(gameTips))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(models)
                    .addComponent(animations)
                    .addComponent(theora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprites)
                    .addComponent(graphics)
                    .addComponent(vorbis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textures)
                    .addComponent(clientVarpBits)
                    .addComponent(mapEffects))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main Configuration", jPanel1);

        addOption1.setText("Pack xTeas");

        addOption2.setText("Overwrite Backgrounds & Logos");

        addOption0.setText("Pack Only New Items");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOption2)
                    .addComponent(addOption1)
                    .addComponent(addOption0))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addOption0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOption1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOption2)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Additional Options", jPanel2);

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Output", jPanel3);

        packButton.setText("Pack Cache");
        packButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToMainButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(packButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMainButton)
                    .addComponent(packButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainButtonActionPerformed
        setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_backToMainButtonActionPerformed

    private void packButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packButtonActionPerformed
        NormalPack.setSettings(this);
        NormalPack.proceedPacking();
    }//GEN-LAST:event_packButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addOption0;
    private javax.swing.JCheckBox addOption1;
    private javax.swing.JCheckBox addOption2;
    private javax.swing.JCheckBox animations;
    private javax.swing.JButton backToMainButton;
    private javax.swing.JCheckBox clientVarpBits;
    private javax.swing.JCheckBox clientscripts;
    private javax.swing.JCheckBox config;
    private javax.swing.JCheckBox fonts;
    private javax.swing.JCheckBox gameTips;
    private javax.swing.JCheckBox graphicConfigurations;
    private javax.swing.JCheckBox graphicShaders;
    private javax.swing.JCheckBox graphics;
    private javax.swing.JCheckBox huffmanEncoding;
    private javax.swing.JCheckBox index29;
    private javax.swing.JCheckBox interfaceScripts;
    private javax.swing.JCheckBox interfaces;
    private javax.swing.JCheckBox items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox mapEffects;
    private javax.swing.JCheckBox maps;
    private javax.swing.JCheckBox models;
    private javax.swing.JCheckBox music;
    private javax.swing.JCheckBox nativeLibs;
    private javax.swing.JCheckBox npcs;
    private javax.swing.JCheckBox objects;
    private javax.swing.JTextArea output;
    private javax.swing.JCheckBox p11FontsImages;
    private javax.swing.JButton packButton;
    private javax.swing.JCheckBox qcMenus;
    private javax.swing.JCheckBox qcMessages;
    private javax.swing.JCheckBox skeletons;
    private javax.swing.JCheckBox skins;
    private javax.swing.JCheckBox soundEffects;
    private javax.swing.JCheckBox sprites;
    private javax.swing.JCheckBox textures;
    private javax.swing.JCheckBox theora;
    private javax.swing.JCheckBox vorbis;
    private javax.swing.JCheckBox worldMap;
    // End of variables declaration//GEN-END:variables

    public JCheckBox getAddOption0() {
        return addOption0;
    }

    public void setAddOption0(JCheckBox addOption0) {
        this.addOption0 = addOption0;
    }

    public JCheckBox getAddOption1() {
        return addOption1;
    }

    public void setAddOption1(JCheckBox addOption1) {
        this.addOption1 = addOption1;
    }

    public JCheckBox getAddOption2() {
        return addOption2;
    }

    public void setAddOption2(JCheckBox addOption2) {
        this.addOption2 = addOption2;
    }

    public JCheckBox getAnimations() {
        return animations;
    }

    public void setAnimations(JCheckBox animations) {
        this.animations = animations;
    }

    public JButton getBackToMainButton() {
        return backToMainButton;
    }

    public void setBackToMainButton(JButton backToMainButton) {
        this.backToMainButton = backToMainButton;
    }

    public JCheckBox getClientVarpBits() {
        return clientVarpBits;
    }

    public void setClientVarpBits(JCheckBox clientVarpBits) {
        this.clientVarpBits = clientVarpBits;
    }

    public JCheckBox getClientscripts() {
        return clientscripts;
    }

    public void setClientscripts(JCheckBox clientscripts) {
        this.clientscripts = clientscripts;
    }

    public JCheckBox getConfig() {
        return config;
    }

    public void setConfig(JCheckBox config) {
        this.config = config;
    }

    public JCheckBox getFonts() {
        return fonts;
    }

    public void setFonts(JCheckBox fonts) {
        this.fonts = fonts;
    }

    public JCheckBox getGameTips() {
        return gameTips;
    }

    public void setGameTips(JCheckBox gameTips) {
        this.gameTips = gameTips;
    }

    public JCheckBox getGraphicConfigurations() {
        return graphicConfigurations;
    }

    public void setGraphicConfigurations(JCheckBox graphicConfigurations) {
        this.graphicConfigurations = graphicConfigurations;
    }

    public JCheckBox getGraphicShaders() {
        return graphicShaders;
    }

    public void setGraphicShaders(JCheckBox graphicShaders) {
        this.graphicShaders = graphicShaders;
    }

    public JCheckBox getGraphicss() {
        return graphics;
    }

    public void setGraphics(JCheckBox graphics) {
        this.graphics = graphics;
    }

    public JCheckBox getHuffmanEncoding() {
        return huffmanEncoding;
    }

    public void setHuffmanEncoding(JCheckBox huffmanEncoding) {
        this.huffmanEncoding = huffmanEncoding;
    }

    public JCheckBox getIndex29() {
        return index29;
    }

    public void setIndex29(JCheckBox index29) {
        this.index29 = index29;
    }

    public JCheckBox getInterfaceScripts() {
        return interfaceScripts;
    }

    public void setInterfaceScripts(JCheckBox interfaceScripts) {
        this.interfaceScripts = interfaceScripts;
    }

    public JCheckBox getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(JCheckBox interfaces) {
        this.interfaces = interfaces;
    }

    public JCheckBox getItems() {
        return items;
    }

    public void setItems(JCheckBox items) {
        this.items = items;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JCheckBox getMapEffects() {
        return mapEffects;
    }

    public void setMapEffects(JCheckBox mapEffects) {
        this.mapEffects = mapEffects;
    }

    public JCheckBox getMaps() {
        return maps;
    }

    public void setMaps(JCheckBox maps) {
        this.maps = maps;
    }

    public JCheckBox getModels() {
        return models;
    }

    public void setModels(JCheckBox models) {
        this.models = models;
    }

    public JCheckBox getMusic() {
        return music;
    }

    public void setMusic(JCheckBox music) {
        this.music = music;
    }

    public JCheckBox getNativeLibs() {
        return nativeLibs;
    }

    public void setNativeLibs(JCheckBox nativeLibs) {
        this.nativeLibs = nativeLibs;
    }

    public JCheckBox getNpcs() {
        return npcs;
    }

    public void setNpcs(JCheckBox npcs) {
        this.npcs = npcs;
    }

    public JCheckBox getObjects() {
        return objects;
    }

    public void setObjects(JCheckBox objects) {
        this.objects = objects;
    }

    public JTextArea getOutput() {
        return output;
    }

    public void setOutput(JTextArea output) {
        this.output = output;
    }

    public JCheckBox getP11FontsImages() {
        return p11FontsImages;
    }

    public void setP11FontsImages(JCheckBox p11FontsImages) {
        this.p11FontsImages = p11FontsImages;
    }

    public JButton getPackButton() {
        return packButton;
    }

    public void setPackButton(JButton packButton) {
        this.packButton = packButton;
    }

    public JCheckBox getQcMenus() {
        return qcMenus;
    }

    public void setQcMenus(JCheckBox qcMenus) {
        this.qcMenus = qcMenus;
    }

    public JCheckBox getQcMessages() {
        return qcMessages;
    }

    public void setQcMessages(JCheckBox qcMessages) {
        this.qcMessages = qcMessages;
    }

    public JCheckBox getSkeletons() {
        return skeletons;
    }

    public void setSkeletons(JCheckBox skeletons) {
        this.skeletons = skeletons;
    }

    public JCheckBox getSkins() {
        return skins;
    }

    public void setSkins(JCheckBox skins) {
        this.skins = skins;
    }

    public JCheckBox getSoundEffects() {
        return soundEffects;
    }

    public void setSoundEffects(JCheckBox soundEffects) {
        this.soundEffects = soundEffects;
    }

    public JCheckBox getSprites() {
        return sprites;
    }

    public void setSprites(JCheckBox sprites) {
        this.sprites = sprites;
    }

    public JCheckBox getTextures() {
        return textures;
    }

    public void setTextures(JCheckBox textures) {
        this.textures = textures;
    }

    public JCheckBox getTheora() {
        return theora;
    }

    public void setTheora(JCheckBox theora) {
        this.theora = theora;
    }

    public JCheckBox getVorbis() {
        return vorbis;
    }

    public void setVorbis(JCheckBox vorbis) {
        this.vorbis = vorbis;
    }

    public JCheckBox getWorldMap() {
        return worldMap;
    }

    public void setWorldMap(JCheckBox worldMap) {
        this.worldMap = worldMap;
    }
    private static String currentCacheLocation;
    private static String newCacheLocation;
    private static String xteasLocation;

    public static String getCurrentCacheLocation() {
        return currentCacheLocation;
    }

    public static String getNewCacheLocation() {
        return newCacheLocation;
    }

    public static String getXteasLocation() {
        return xteasLocation;
    }

    public static String currentCacheLocation(Main main) {
        return main.getCurrentCacheLocation().getText();
    }

    public static String newCacheLocation(Main main) {
        return main.getNewCacheLocation().getText();
    }

    public static String xteasLocation(Main main) {
        return main.getxTeasLocation().getText();
    }

    public static void setLocations(Main main) {
        currentCacheLocation = currentCacheLocation(main);
        newCacheLocation = newCacheLocation(main);
        xteasLocation = xteasLocation(main);
    }

    private void updateTextArea(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                output.append(text);
            }
        });
    }

    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                updateTextArea(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextArea(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }
}
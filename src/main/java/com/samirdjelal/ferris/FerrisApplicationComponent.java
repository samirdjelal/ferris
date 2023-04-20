package com.samirdjelal.ferris;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class FerrisApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", FerrisProgressBarUi.class.getName());
        UIManager.getDefaults().put(FerrisProgressBarUi.class.getName(), FerrisProgressBarUi.class);
    }
}

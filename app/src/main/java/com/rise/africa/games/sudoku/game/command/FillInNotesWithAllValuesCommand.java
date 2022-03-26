package com.rise.africa.games.sudoku.game.command;

import com.rise.africa.games.sudoku.game.CellCollection;

public class FillInNotesWithAllValuesCommand extends AbstractMultiNoteCommand {

    public FillInNotesWithAllValuesCommand() {
    }

    @Override
    void execute() {
        CellCollection cells = getCells();

        mOldNotes.clear();
        saveOldNotes();

        cells.fillInNotesWithAllValues();
    }
}

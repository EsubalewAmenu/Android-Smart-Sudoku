package com.rise.africa.games.sudoku.game.command;

import com.rise.africa.games.sudoku.game.CellCollection;

public class FillInNotesCommand extends AbstractMultiNoteCommand {

    public FillInNotesCommand() {
    }

    @Override
    void execute() {
        CellCollection cells = getCells();

        mOldNotes.clear();
        saveOldNotes();

        cells.fillInNotes();
    }
}

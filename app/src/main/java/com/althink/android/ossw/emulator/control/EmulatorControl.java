package com.althink.android.ossw.emulator.control;

import com.althink.android.ossw.emulator.renderer.EmulatorExecutionContext;
import com.althink.android.ossw.emulator.renderer.LowLevelRenderer;

/**
 * Created by krzysiek on 14/06/15.
 */
public interface EmulatorControl {

    void draw(LowLevelRenderer renderer, EmulatorExecutionContext ctx);
}

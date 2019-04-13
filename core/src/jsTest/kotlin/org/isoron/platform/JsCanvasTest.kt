/*
 * Copyright (C) 2016-2019 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.isoron.platform

import org.isoron.platform.gui.*
import org.w3c.dom.*
import kotlin.browser.*
import kotlin.test.*

class JsCanvasTest : CanvasTest.Platform {
    override fun createCanvas(width: Int, height: Int): Canvas {
        val canvasElement = document.getElementById("canvas") as HTMLCanvasElement
        canvasElement.style.width = "${width}px"
        canvasElement.style.height = "${height}px"
        return HtmlCanvas(canvasElement)
    }

    override fun exportCanvas(canvas: Canvas, filename: String) {
        // do nothing
    }

    @Test
    fun testDrawing() = CanvasTest(this).run()
}
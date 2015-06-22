package android.emu6502.instructions.impl

import android.emu6502.CPU
import android.emu6502.instructions.BaseInstruction
import android.emu6502.instructions.Instruction

/** LoaD X register */
class LDX(private val cpu: CPU) : BaseInstruction(Instruction.LDX, cpu.instructionList) {
  override fun immediate() {
    cpu.X = cpu.popByte()
    cpu.setSZflagsForRegX()
  }
}
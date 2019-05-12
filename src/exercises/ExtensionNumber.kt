package exercises

import java.math.BigDecimal
import java.math.RoundingMode

fun Float.percentOf(value: Float) = (this / value)* 100

fun Float.customPrescision(presion : Int) = BigDecimal(this.toString()).setScale(presion, RoundingMode.HALF_UP).toFloat()
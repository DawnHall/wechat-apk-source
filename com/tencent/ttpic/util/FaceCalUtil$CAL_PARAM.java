package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FaceCalUtil$CAL_PARAM
{
  public final float value;

  static
  {
    AppMethodBeat.i(83831);
    FACE_WIDTH_SCALE_FACTOR = new CAL_PARAM("FACE_WIDTH_SCALE_FACTOR", 0, 1.0F);
    EYE_DIST_SCALE_FACTOR = new CAL_PARAM("EYE_DIST_SCALE_FACTOR", 1, 1.0F);
    EYE_WIDTH_SCALE_FACTOR = new CAL_PARAM("EYE_WIDTH_SCALE_FACTOR", 2, 1.0F);
    EYE_HEIGHT_SCALE_FACTOR = new CAL_PARAM("EYE_HEIGHT_SCALE_FACTOR", 3, 1.0F);
    EYE_ANGLE_SCALE_FACTOR = new CAL_PARAM("EYE_ANGLE_SCALE_FACTOR", 4, 1.0F);
    BROW_ANGLE_SCALE_FACTOR = new CAL_PARAM("BROW_ANGLE_SCALE_FACTOR", 5, 1.0F);
    BROW_DIST_X_SCALE_FACTOR = new CAL_PARAM("BROW_DIST_X_SCALE_FACTOR", 6, 1.0F);
    BROW_DIST_Y_SCALE_FACTOR = new CAL_PARAM("BROW_DIST_Y_SCALE_FACTOR", 7, 1.0F);
    BROW_WIDTH_SCALE_FACTOR = new CAL_PARAM("BROW_WIDTH_SCALE_FACTOR", 8, 1.0F);
    BROW_HEIGHT_SCALE_FACTOR = new CAL_PARAM("BROW_HEIGHT_SCALE_FACTOR", 9, 1.0F);
    MOUTH_DIST_Y_SCALE_FACTOR = new CAL_PARAM("MOUTH_DIST_Y_SCALE_FACTOR", 10, 1.0F);
    MOUTH_WIDTH_SCALE_FACTOR = new CAL_PARAM("MOUTH_WIDTH_SCALE_FACTOR", 11, 1.0F);
    MOUTH_HEIGHT_SCALE_FACTOR = new CAL_PARAM("MOUTH_HEIGHT_SCALE_FACTOR", 12, 1.0F);
    NOSE_DIST_Y_SCALE_FACTOR = new CAL_PARAM("NOSE_DIST_Y_SCALE_FACTOR", 13, 1.0F);
    NOSE_WIDTH_SCALE_FACTOR = new CAL_PARAM("NOSE_WIDTH_SCALE_FACTOR", 14, 1.0F);
    NOSE_HEIGHT_SCALE_FACTOR = new CAL_PARAM("NOSE_HEIGHT_SCALE_FACTOR", 15, 1.0F);
    FACE_V_SCALE_FACTOR = new CAL_PARAM("FACE_V_SCALE_FACTOR", 16, 1.0F);
    POW_FACTOR = new CAL_PARAM("POW_FACTOR", 17, 1.0F);
    POW_FACTOR_EYE = new CAL_PARAM("POW_FACTOR_EYE", 18, 1.0F);
    $VALUES = new CAL_PARAM[] { FACE_WIDTH_SCALE_FACTOR, EYE_DIST_SCALE_FACTOR, EYE_WIDTH_SCALE_FACTOR, EYE_HEIGHT_SCALE_FACTOR, EYE_ANGLE_SCALE_FACTOR, BROW_ANGLE_SCALE_FACTOR, BROW_DIST_X_SCALE_FACTOR, BROW_DIST_Y_SCALE_FACTOR, BROW_WIDTH_SCALE_FACTOR, BROW_HEIGHT_SCALE_FACTOR, MOUTH_DIST_Y_SCALE_FACTOR, MOUTH_WIDTH_SCALE_FACTOR, MOUTH_HEIGHT_SCALE_FACTOR, NOSE_DIST_Y_SCALE_FACTOR, NOSE_WIDTH_SCALE_FACTOR, NOSE_HEIGHT_SCALE_FACTOR, FACE_V_SCALE_FACTOR, POW_FACTOR, POW_FACTOR_EYE };
    AppMethodBeat.o(83831);
  }

  private FaceCalUtil$CAL_PARAM(float paramFloat)
  {
    this.value = paramFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FaceCalUtil.CAL_PARAM
 * JD-Core Version:    0.6.2
 */
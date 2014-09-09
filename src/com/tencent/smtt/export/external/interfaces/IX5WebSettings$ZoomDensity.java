package com.tencent.smtt.export.external.interfaces;

public enum IX5WebSettings$ZoomDensity
{
  int value;

  static
  {
    CLOSE = new ZoomDensity("CLOSE", 2, 75);
    ZoomDensity[] arrayOfZoomDensity = new ZoomDensity[3];
    arrayOfZoomDensity[0] = FAR;
    arrayOfZoomDensity[1] = MEDIUM;
    arrayOfZoomDensity[2] = CLOSE;
  }

  private IX5WebSettings$ZoomDensity(int arg3)
  {
    int j;
    this.value = j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.ZoomDensity
 * JD-Core Version:    0.6.2
 */
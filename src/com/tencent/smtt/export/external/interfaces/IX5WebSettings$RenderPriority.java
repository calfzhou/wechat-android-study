package com.tencent.smtt.export.external.interfaces;

public enum IX5WebSettings$RenderPriority
{
  static
  {
    HIGH = new RenderPriority("HIGH", 1);
    LOW = new RenderPriority("LOW", 2);
    RenderPriority[] arrayOfRenderPriority = new RenderPriority[3];
    arrayOfRenderPriority[0] = NORMAL;
    arrayOfRenderPriority[1] = HIGH;
    arrayOfRenderPriority[2] = LOW;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.RenderPriority
 * JD-Core Version:    0.6.2
 */
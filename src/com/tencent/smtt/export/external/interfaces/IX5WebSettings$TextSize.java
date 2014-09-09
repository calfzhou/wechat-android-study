package com.tencent.smtt.export.external.interfaces;

public enum IX5WebSettings$TextSize
{
  int value;

  static
  {
    SMALLER = new TextSize("SMALLER", 1, 75);
    NORMAL = new TextSize("NORMAL", 2, 100);
    LARGER = new TextSize("LARGER", 3, 125);
    LARGEST = new TextSize("LARGEST", 4, 150);
    TextSize[] arrayOfTextSize = new TextSize[5];
    arrayOfTextSize[0] = SMALLEST;
    arrayOfTextSize[1] = SMALLER;
    arrayOfTextSize[2] = NORMAL;
    arrayOfTextSize[3] = LARGER;
    arrayOfTextSize[4] = LARGEST;
  }

  private IX5WebSettings$TextSize(int arg3)
  {
    int j;
    this.value = j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.TextSize
 * JD-Core Version:    0.6.2
 */
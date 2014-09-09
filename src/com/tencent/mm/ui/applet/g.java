package com.tencent.mm.ui.applet;

import java.util.LinkedList;

final class g
{
  private LinkedList dJw = null;
  private int maxSize = 40;

  public g(b paramb, int paramInt)
  {
  }

  final boolean contains(String paramString)
  {
    return this.dJw.contains(paramString);
  }

  final void vd(String paramString)
  {
    if (this.dJw.contains(paramString));
    do
    {
      return;
      this.dJw.add(paramString);
    }
    while (this.dJw.size() < this.maxSize);
    this.dJw.removeFirst();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.g
 * JD-Core Version:    0.6.2
 */
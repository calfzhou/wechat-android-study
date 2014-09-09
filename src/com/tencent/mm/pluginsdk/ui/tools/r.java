package com.tencent.mm.pluginsdk.ui.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class r
{
  List hKR = new ArrayList();

  final String aES()
  {
    if ((this.hKR == null) || (this.hKR.size() == 0))
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.hKR.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append((String)localIterator.next());
      localStringBuffer.append(";");
    }
    return localStringBuffer.toString();
  }

  final void qp(String paramString)
  {
    this.hKR = new ArrayList();
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return;
      for (String str : paramString.split(";"))
        this.hKR.add(str);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.r
 * JD-Core Version:    0.6.2
 */
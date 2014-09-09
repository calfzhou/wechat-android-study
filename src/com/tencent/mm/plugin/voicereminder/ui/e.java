package com.tencent.mm.plugin.voicereminder.ui;

import com.tencent.mm.platformtools.ap;
import com.tencent.mm.ui.base.aa;
import java.util.Iterator;
import java.util.List;

final class e
  implements Runnable
{
  e(RemindDialog paramRemindDialog)
  {
  }

  public final void run()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = RemindDialog.a(this.gTb).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (ap.jb(str))
        localStringBuffer.append("\n\n");
      else
        localStringBuffer.append(str + "\n\n");
    }
    if (RemindDialog.d(this.gTb) != null)
      RemindDialog.d(this.gTb).setMessage(localStringBuffer);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.ui.e
 * JD-Core Version:    0.6.2
 */
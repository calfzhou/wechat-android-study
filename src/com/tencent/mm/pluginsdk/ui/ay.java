package com.tencent.mm.pluginsdk.ui;

import android.os.Message;
import com.tencent.mm.pluginsdk.ui.simley.a;
import com.tencent.mm.pluginsdk.ui.simley.d;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class ay extends cm
{
  ay(ax paramax)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    z.d("repullemojiinfodesc", "notify smileygrid");
    String str = (String)paramMessage.obj;
    if ((SmileyGrid.e(this.hzD.hzy) == null) || (str == null) || (!SmileyGrid.e(this.hzD.hzy).equals(str)))
      return;
    a.hId.hIt.hIf = "";
    a.hId.hIt.hIg = false;
    this.hzD.update();
    SmileyGrid.h(this.hzD.hzy).put(str, Boolean.valueOf(true));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ay
 * JD-Core Version:    0.6.2
 */
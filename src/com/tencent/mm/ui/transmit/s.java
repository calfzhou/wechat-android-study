package com.tencent.mm.ui.transmit;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;

final class s
  implements MenuItem.OnMenuItemClickListener
{
  s(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jYz.XF();
    if (SelectConversationUI.i(this.jYz) != null)
      ReportUtil.a(this.jYz, SelectConversationUI.i(this.jYz));
    this.jYz.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.s
 * JD-Core Version:    0.6.2
 */
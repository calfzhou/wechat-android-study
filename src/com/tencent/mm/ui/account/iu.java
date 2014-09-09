package com.tencent.mm.ui.account;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.cn;

final class iu
  implements AdapterView.OnItemClickListener
{
  iu(RegSetInfoUI paramRegSetInfoUI, String[] paramArrayOfString)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (RegSetInfoUI.u(this.iSh) != null)
    {
      RegSetInfoUI.u(this.iSh).dismiss();
      RegSetInfoUI.v(this.iSh);
    }
    RegSetInfoUI.a(this.iSh).setText(this.iSs[paramInt]);
    RegSetInfoUI.a(this.iSh).postDelayed(new iv(this), 50L);
    RegSetInfoUI.s(this.iSh).setText(this.iSh.getString(n.bZl));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.iu
 * JD-Core Version:    0.6.2
 */
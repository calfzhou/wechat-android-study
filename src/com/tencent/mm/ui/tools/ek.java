package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cg;

final class ek
  implements View.OnLongClickListener
{
  ek(ei paramei, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu normal view long click");
    ei.a(this.jTS).clear();
    this.jTR.onCreateContextMenu(ei.a(this.jTS), paramView, null);
    this.jTS.baG();
    return ei.a(this.jTS).size() > 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ek
 * JD-Core Version:    0.6.2
 */
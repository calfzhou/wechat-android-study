package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;

final class dk
  implements DialogInterface.OnClickListener
{
  dk(ct paramct, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qX().a(380, this.iUV);
    ct.a(this.iUV, new a(new dl(this), ((ai)this.dpb).getUsername(), ((ai)this.dpb).wl(), ct.a(this.iUV).cTZ));
    ct.b(this.iUV).e(ct.a(this.iUV));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.dk
 * JD-Core Version:    0.6.2
 */
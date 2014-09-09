package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ao;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

public final class ck
  implements m
{
  private Context context;
  private ProgressDialog esI;
  private cn jJl;

  public ck(Context paramContext, cn paramcn)
  {
    this.context = paramContext;
    this.jJl = paramcn;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 116)
      return;
    if (this.esI != null)
    {
      this.esI.dismiss();
      this.esI = null;
    }
    bg.qX().b(116, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      z.i("!44@/B4Tb64lLpJtMRMH2jRSdjywO26gcVOK0n8QE7rOp8Y=", "dealSendInviteEmailSuccess");
      e.a(this.context, n.bPg, n.buo, new cm(this));
      return;
    }
    z.i("!44@/B4Tb64lLpJtMRMH2jRSdjywO26gcVOK0n8QE7rOp8Y=", "dealSendInviteEmailFail");
    this.jJl.fN(false);
  }

  public final void f(int[] paramArrayOfInt)
  {
    bg.qX().a(116, this);
    ao localao = new ao(paramArrayOfInt);
    bg.qX().d(localao);
    Context localContext = this.context;
    this.context.getString(n.bPj);
    this.esI = e.a(localContext, this.context.getString(n.bPh), true, new cl(this, localao));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ck
 * JD-Core Version:    0.6.2
 */
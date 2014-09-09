package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class fc
  implements DialogInterface.OnClickListener
{
  fc(NewTaskUI paramNewTaskUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpIwz/fkTrbJFDJAgnSFqmV8", "imgSid:" + NewTaskUI.a(this.jUn).iPK + " img len" + NewTaskUI.a(this.jUn).iPM.length + " " + k.nL());
    if (NewTaskUI.b(this.jUn) == null)
    {
      z.d("!32@/B4Tb64lLpIwz/fkTrbJFDJAgnSFqmV8", "[arthurdan.SecurityImageCrash] fatal error!!! secimg is null!");
      return;
    }
    i locali = new i(NewTaskUI.a(this.jUn).username, NewTaskUI.a(this.jUn).jTd, NewTaskUI.a(this.jUn).jTe, NewTaskUI.a(this.jUn).iPN, NewTaskUI.b(this.jUn).aRi(), NewTaskUI.b(this.jUn).aRh(), NewTaskUI.b(this.jUn).aRj());
    bg.qX().d(locali);
    NewTaskUI localNewTaskUI1 = this.jUn;
    NewTaskUI localNewTaskUI2 = this.jUn;
    this.jUn.getString(n.buo);
    NewTaskUI.a(localNewTaskUI1, e.a(localNewTaskUI2, this.jUn.getString(n.bQn), true, new fd(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fc
 * JD-Core Version:    0.6.2
 */
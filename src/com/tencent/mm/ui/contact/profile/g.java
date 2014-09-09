package com.tencent.mm.ui.contact.profile;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.n.s;
import com.tencent.mm.n.u;
import com.tencent.mm.sdk.platformtools.z;

final class g
  implements u
{
  g(ContactSocialInfoUI paramContactSocialInfoUI, s params, String paramString1, String paramString2)
  {
  }

  public final int A(int paramInt1, int paramInt2)
  {
    this.dmN.sk();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXR+gVSI1ZPdl2KTBA9Tr56o=", "onSceneEnd: errType=%d, errCode=%d", arrayOfObject);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      Bitmap localBitmap = af.sh().eV(this.dmX);
      if (ContactSocialInfoUI.a(this.jDe, this.jzY, localBitmap))
      {
        Toast.makeText(this.jDe.aPI(), this.jDe.aPI().getString(n.bCT), 0).show();
        return 0;
      }
    }
    Toast.makeText(this.jDe.aPI(), this.jDe.aPI().getString(n.bCR), 0).show();
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.g
 * JD-Core Version:    0.6.2
 */
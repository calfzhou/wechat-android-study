package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

public final class f extends b
{
  public f(Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLCrDOH6fPn65ussCaQChMuH2fpxyJ3Vk4=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }

  public final boolean b(n paramn)
  {
    z.d("!44@/B4Tb64lLpLCrDOH6fPn65ussCaQChMuH2fpxyJ3Vk4=", "handleOpenUrl");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean c(n paramn)
  {
    z.d("!44@/B4Tb64lLpLCrDOH6fPn65ussCaQChMuH2fpxyJ3Vk4=", "handleIgnore");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean d(n paramn)
  {
    z.d("!44@/B4Tb64lLpLCrDOH6fPn65ussCaQChMuH2fpxyJ3Vk4=", "handleFalseLast");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean e(n paramn)
  {
    z.d("!44@/B4Tb64lLpLCrDOH6fPn65ussCaQChMuH2fpxyJ3Vk4=", "handleFalseCancel");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.f
 * JD-Core Version:    0.6.2
 */
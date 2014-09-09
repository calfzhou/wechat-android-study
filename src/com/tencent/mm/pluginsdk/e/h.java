package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

public final class h extends b
{
  public h(Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLO1PBcmq1+oFPOKFBCwXUBqUVKA196e/I=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }

  public final boolean b(n paramn)
  {
    z.d("!44@/B4Tb64lLpLO1PBcmq1+oFPOKFBCwXUBqUVKA196e/I=", "handleOpenUrl");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean c(n paramn)
  {
    z.d("!44@/B4Tb64lLpLO1PBcmq1+oFPOKFBCwXUBqUVKA196e/I=", "handleIgnore");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean d(n paramn)
  {
    z.d("!44@/B4Tb64lLpLO1PBcmq1+oFPOKFBCwXUBqUVKA196e/I=", "handleFalseLast");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean e(n paramn)
  {
    z.d("!44@/B4Tb64lLpLO1PBcmq1+oFPOKFBCwXUBqUVKA196e/I=", "handleFalseCancel");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.h
 * JD-Core Version:    0.6.2
 */
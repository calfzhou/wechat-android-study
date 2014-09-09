package com.tencent.mm.pluginsdk.e;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

public final class g extends b
{
  public g(Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpJ4Cs1QsuwAT9z9oVa3htfIp20bEGQ2AsY=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }

  public final boolean b(n paramn)
  {
    z.d("!44@/B4Tb64lLpJ4Cs1QsuwAT9z9oVa3htfIp20bEGQ2AsY=", "handleOpenUrl");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean c(n paramn)
  {
    z.d("!44@/B4Tb64lLpJ4Cs1QsuwAT9z9oVa3htfIp20bEGQ2AsY=", "handleIgnore");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean d(n paramn)
  {
    z.d("!44@/B4Tb64lLpJ4Cs1QsuwAT9z9oVa3htfIp20bEGQ2AsY=", "handleFalseLast");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }

  public final boolean e(n paramn)
  {
    z.d("!44@/B4Tb64lLpJ4Cs1QsuwAT9z9oVa3htfIp20bEGQ2AsY=", "handleFalseCancel");
    Toast.makeText(this.cHB, paramn.content, 0).show();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.g
 * JD-Core Version:    0.6.2
 */
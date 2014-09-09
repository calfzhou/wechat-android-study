package com.tencent.mm.o;

import android.os.RemoteException;
import com.tencent.mm.network.n;
import com.tencent.mm.network.o;
import com.tencent.mm.sdk.platformtools.ch;

public final class al
  implements n
{
  private final o dph;

  public al(o paramo)
  {
    this.dph = paramo;
  }

  private String getUsername()
  {
    try
    {
      String str = this.dph.getUsername();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final void e(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      this.dph.e(paramString1, paramString2, paramString3);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void g(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      this.dph.g(paramString, paramArrayOfByte);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final byte[] jl(String paramString)
  {
    try
    {
      byte[] arrayOfByte = this.dph.jl(paramString);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final void l(String paramString, int paramInt)
  {
    try
    {
      this.dph.l(paramString, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final int oD()
  {
    try
    {
      int i = this.dph.oD();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 0;
  }

  public final String qL()
  {
    try
    {
      String str = this.dph.qL();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final void reset()
  {
    try
    {
      this.dph.reset();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final byte[] tC()
  {
    try
    {
      byte[] arrayOfByte = this.dph.tC();
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final String toString()
  {
    String str1 = "RAccInfo:\n" + "|-uin     =" + oD() + "\n";
    String str2 = str1 + "|-user    =" + getUsername() + "\n";
    String str3 = str2 + "|-session =" + qL() + "\n";
    return str3 + "`-cookie  =" + ch.cF(tC());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.al
 * JD-Core Version:    0.6.2
 */
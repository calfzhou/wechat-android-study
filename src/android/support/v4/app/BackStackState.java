package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new c();
  final int K;
  final int L;
  final int P;
  final CharSequence Q;
  final int S;
  final CharSequence T;
  final int[] ad;
  final int mIndex;
  final String mName;

  public BackStackState(Parcel paramParcel)
  {
    this.ad = paramParcel.createIntArray();
    this.K = paramParcel.readInt();
    this.L = paramParcel.readInt();
    this.mName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    this.P = paramParcel.readInt();
    this.Q = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.S = paramParcel.readInt();
    this.T = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
  }

  public BackStackState(a parama)
  {
    b localb1 = parama.D;
    int i = 0;
    while (localb1 != null)
    {
      if (localb1.ac != null)
        i += localb1.ac.size();
      localb1 = localb1.U;
    }
    this.ad = new int[i + 7 * parama.F];
    if (!parama.M)
      throw new IllegalStateException("Not on back stack");
    b localb2 = parama.D;
    int j = 0;
    if (localb2 != null)
    {
      int[] arrayOfInt1 = this.ad;
      int k = j + 1;
      arrayOfInt1[j] = localb2.W;
      int[] arrayOfInt2 = this.ad;
      int m = k + 1;
      if (localb2.X != null);
      int i4;
      int i6;
      for (int n = localb2.X.mIndex; ; n = -1)
      {
        arrayOfInt2[k] = n;
        int[] arrayOfInt3 = this.ad;
        int i1 = m + 1;
        arrayOfInt3[m] = localb2.Y;
        int[] arrayOfInt4 = this.ad;
        int i2 = i1 + 1;
        arrayOfInt4[i1] = localb2.Z;
        int[] arrayOfInt5 = this.ad;
        int i3 = i2 + 1;
        arrayOfInt5[i2] = localb2.aa;
        int[] arrayOfInt6 = this.ad;
        i4 = i3 + 1;
        arrayOfInt6[i3] = localb2.ab;
        if (localb2.ac == null)
          break label343;
        int i5 = localb2.ac.size();
        int[] arrayOfInt8 = this.ad;
        i6 = i4 + 1;
        arrayOfInt8[i4] = i5;
        int i7 = 0;
        while (i7 < i5)
        {
          int[] arrayOfInt9 = this.ad;
          int i8 = i6 + 1;
          arrayOfInt9[i6] = ((Fragment)localb2.ac.get(i7)).mIndex;
          i7++;
          i6 = i8;
        }
      }
      j = i6;
      while (true)
      {
        localb2 = localb2.U;
        break;
        label343: int[] arrayOfInt7 = this.ad;
        j = i4 + 1;
        arrayOfInt7[i4] = 0;
      }
    }
    this.K = parama.K;
    this.L = parama.L;
    this.mName = parama.mName;
    this.mIndex = parama.mIndex;
    this.P = parama.P;
    this.Q = parama.Q;
    this.S = parama.S;
    this.T = parama.T;
  }

  public final a a(m paramm)
  {
    a locala = new a(paramm);
    int i = 0;
    int i5;
    for (int j = 0; j < this.ad.length; j = i5)
    {
      b localb = new b();
      int[] arrayOfInt1 = this.ad;
      int k = j + 1;
      localb.W = arrayOfInt1[j];
      if (m.DEBUG)
        new StringBuilder("Instantiate ").append(locala).append(" op #").append(i).append(" base fragment #").append(this.ad[k]);
      int[] arrayOfInt2 = this.ad;
      int m = k + 1;
      int n = arrayOfInt2[k];
      if (n >= 0);
      for (localb.X = ((Fragment)paramm.bm.get(n)); ; localb.X = null)
      {
        int[] arrayOfInt3 = this.ad;
        int i1 = m + 1;
        localb.Y = arrayOfInt3[m];
        int[] arrayOfInt4 = this.ad;
        int i2 = i1 + 1;
        localb.Z = arrayOfInt4[i1];
        int[] arrayOfInt5 = this.ad;
        int i3 = i2 + 1;
        localb.aa = arrayOfInt5[i2];
        int[] arrayOfInt6 = this.ad;
        int i4 = i3 + 1;
        localb.ab = arrayOfInt6[i3];
        int[] arrayOfInt7 = this.ad;
        i5 = i4 + 1;
        int i6 = arrayOfInt7[i4];
        if (i6 <= 0)
          break;
        localb.ac = new ArrayList(i6);
        int i7 = 0;
        while (i7 < i6)
        {
          if (m.DEBUG)
            new StringBuilder("Instantiate ").append(locala).append(" set remove fragment #").append(this.ad[i5]);
          ArrayList localArrayList = paramm.bm;
          int[] arrayOfInt8 = this.ad;
          int i8 = i5 + 1;
          Fragment localFragment = (Fragment)localArrayList.get(arrayOfInt8[i5]);
          localb.ac.add(localFragment);
          i7++;
          i5 = i8;
        }
      }
      locala.a(localb);
      i++;
    }
    locala.K = this.K;
    locala.L = this.L;
    locala.mName = this.mName;
    locala.mIndex = this.mIndex;
    locala.M = true;
    locala.P = this.P;
    locala.Q = this.Q;
    locala.S = this.S;
    locala.T = this.T;
    locala.a(1);
    return locala;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.ad);
    paramParcel.writeInt(this.K);
    paramParcel.writeInt(this.L);
    paramParcel.writeString(this.mName);
    paramParcel.writeInt(this.mIndex);
    paramParcel.writeInt(this.P);
    TextUtils.writeToParcel(this.Q, paramParcel, 0);
    paramParcel.writeInt(this.S);
    TextUtils.writeToParcel(this.T, paramParcel, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.2
 */
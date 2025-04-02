package hi.baka3k.digitalkey.vehicle

import hi.baka3k.data.sharedmodel.ext.toHexString
import hi.baka3k.data.sharedmodel.ext.toRandomByte

/**
 * Identify of vehicle
 * Using ONLY for Test, in production, vehicle information will be define in 'prepare phase'
 * */
object VehicleIdentity {
    // ID vehicle - in simulation project I choose random value,
    val protocol_version = byteArrayOf(0x01, 0x00)

    // transaction id - default for test
    val transaction_identifier = 16.toRandomByte()

    // ID vehicle - in simulation project I choose random hash,
    val vehicalIdentify = 8.toRandomByte()

    // original key store in Vehical, in simulation project I choose random hash,
//    val ephemeralKeyPair = BouncyCastle.getInstance().genEphemeralKeyPair()// EcDsa.generateEphemeralKeyPair()
//    val cryptoBoxKeyPair = BouncyCastle.getInstance().genECKeyPair() // EcDsa.generateCryptoBoxKeyPair()
//    val signKeyPair = BouncyCastle.getInstance().genECKeyPair()
    val digitalKeyIdentifer = byteArrayOf(0x02, 0x06, 0x01, 0x09, 0x08, 0x06).toHexString()
}

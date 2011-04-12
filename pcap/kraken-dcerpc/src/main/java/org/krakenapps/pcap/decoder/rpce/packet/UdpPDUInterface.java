package org.krakenapps.pcap.decoder.rpce.packet;

import org.krakenapps.pcap.decoder.rpce.RpcUdpHeader;
import org.krakenapps.pcap.util.Buffer;

public interface UdpPDUInterface {
	public void parse(Buffer b , RpcUdpHeader h);
}

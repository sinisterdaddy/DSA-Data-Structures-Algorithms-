def message_delivery(k, messages, timestamps):
    n = len(timestamps)
    result = []

    last_seen = {}  # Dictionary to store the last seen timestamp for each message

    for i in range(n):
        current_message = messages[i]
        current_timestamp = timestamps[i]

        # Check if the current message has been seen within the last k seconds
        if current_message in last_seen and current_timestamp - last_seen[current_message] < k:
            result.append("false")  # Message dropped
        else:
            result.append("true")   # Message delivered

        last_seen[current_message] = current_timestamp  # Update the last seen timestamp for the message

    return result

# Example usage
k = int(input("Enter time limit in seconds (k): "))
messages = input("Enter messages separated by spaces: ").split()
timestamps = list(map(int, input("Enter sorted timestamps separated by spaces: ").split()))

delivery_status = message_delivery(k, messages, timestamps)
print("Message delivery status:", delivery_status)

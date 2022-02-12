FROM openjdk:8

# Copy Java application files to the image filesystem
COPY build/classes/java/main /tmp

# Set directory for executing future commands
WORKDIR /tmp

# Run Main.class when container starts
CMD java com.company.Main